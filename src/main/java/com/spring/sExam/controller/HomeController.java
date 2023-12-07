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
	// logger : ���� �߻��Ǵ� ��Ȳ�� ���� �� �����ؼ� ������ ��� ��.
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/h","/aCheck"}, method = RequestMethod.GET)
	// RequestServlet��ü�� ã�ų� ����� �� ����
	// @RequestMapping(value = "/", method = RequestMethod.GET) : ���۹���� �⺻ GET���� �����Ǿ� ����
	// (����, ���۹���� �������� GET���� �����ȴ�.)
	// value �Ű������� 1���� �� ���� value �ۼ��� ���� �� �� ���� 
	
	//	public String home(Locale locale, Model model, HttpServletRequest request) {
	//	int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
	
	public String home(Locale locale, Model model, HttpServletRequest request,	
		@RequestParam(name="age", defaultValue = "0", required = false) int age) {
	 logger.info("Welcome home! The client locale is {}.", locale);
	 	// logger.info(); logger�� �ڹ��� system.out.println();�� ����.
		// locale�� ���� locale is {}." �� {}�� ��
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		String url = "";
		if(age < 20) url = "a1";
		else if(age >=20 && age < 30) url = "a2";
		else url="a3";
				
		model.addAttribute("serverTime", formattedDate );
		// jsp������ setAttribute ��, spring�� addAttribute("����", ��)�� �����ϴ� ��ü��.
		// public String home(Locale locale, Model model)���� ���� (26��° ���ο��� ����Ǿ�����)
		// // model.addAttribute :  ("name1", "�踻��") �踻���̶�� �̸��� serverTime�̶�� ������ ��� �踻���� �����ؼ� home���� �Ѱ��� 
		
		model.addAttribute("name1", "�踻��");
		// request�� �����ֱⰡ �Ȱ��Ƽ� �Ѱ��ְ� ����
		// model.addAttribute :  ("name1", "�踻��") �踻���̶�� �̸��� name�̶�� ������ ��� �踻���� �����ؼ� home���� �Ѱ���
		// ��ü�� model
		
		model.addAttribute("url", url);
		return "home";
		// view ��ü�� ����� �����ؾ���
	   // viewresolver�� view�� ����� ��������
	
	}
	@RequestMapping(value = "/aCheck", method = RequestMethod.POST)
	public String aCheckPost(HttpServletRequest request, Model model) {
		int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
		model.addAttribute("age",age);
		// model ��ü �� �������ֱ�!!!
		return "home";
	}
}
