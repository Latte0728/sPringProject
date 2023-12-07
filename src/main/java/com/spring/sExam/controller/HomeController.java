package com.spring.sExam.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// logger : 현재 발생되는 상황을 찍을 때 선언해서 변수로 담는 것.
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/h","/aCheck"}, method = RequestMethod.GET)
	// RequestServlet객체가 찾거나 사용할 때 감지
	// @RequestMapping(value = "/", method = RequestMethod.GET) : 전송방식은 기본 GET으로 설정되어 있음
	// (따라서, 전송방식을 안적으면 GET으로 설정된다.)
	// value 매개변수가 1개만 들어갈 때는 value 작성을 생략 할 수 있음 
	
	//	public String home(Locale locale, Model model, HttpServletRequest request) {
	//	int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
	
	public String home(Locale locale, Model model, HttpServletRequest request,	
		@RequestParam(name="age", defaultValue = "0", required = false) int age) {
	 logger.info("Welcome home! The client locale is {}.", locale);
	 	// logger.info(); logger는 자바의 system.out.println();과 같다.
		// locale의 값이 locale is {}." 중 {}에 들어감
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String url = "";
		if(age < 20) url = "a1";
		else if(age >=20 && age < 30) url = "a2";
		else url="a3";
				
		model.addAttribute("serverTime", formattedDate );
		// jsp에서는 setAttribute 즉, spring의 addAttribute("변수", 값)는 저장하는 객체임.
		// public String home(Locale locale, Model model)에서 선언 (26번째 라인에서 선언되어있음)
		// // model.addAttribute :  ("name1", "김말숙") 김말숙이라는 이름을 serverTime이라는 변수에 담아 김말숙을 생성해서 home으로 넘겨줌 
		
		model.addAttribute("name1", "김말숙");
		// request와 생명주기가 똑같아서 넘겨주고 끝남
		// model.addAttribute :  ("name1", "김말숙") 김말숙이라는 이름을 name이라는 변수에 담아 김말숙을 생성해서 home으로 넘겨줌
		// 객체가 model
		
		model.addAttribute("url", url);
		return "home";
		// view 객체로 만들어 전송해야함
	   // viewresolver가 view로 만들어 전송해줌
	
	}
	@RequestMapping(value = "/aCheck", method = RequestMethod.POST)
	public String aCheckPost(HttpServletRequest request, Model model) {
		int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
		model.addAttribute("age",age);
		// model 객체 꼭 선언해주기!!!
		return "home";
	}
}
