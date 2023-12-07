package com.spring.sExam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/atom")
// 중간 경로 또는 중간 경로 

public class AtomController {
	
	@RequestMapping(value={"/a1","/atom1"}, method = RequestMethod.GET)
	public String a1Get(Model model, HttpServletRequest request) {
		// a1Get 이라고 적으면 절대 메소드명이 중복 안됨
		
		String name = request.getParameter("name")==null? "" : request.getParameter("name");
		
		model.addAttribute("data","a1에서 갑니다.");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		
		
		return "atom/a1";
	}
		// public String a1Get()중 String이라서 문자열이 return 값으로 와야됨
		// return 뒤에 넘겨줄 값 이름
		// String일때는 model로 넘겨야 됨 model객체가 안정적이라고 spring에서 권고함
		// 현재 메소드에는 request 사용 불가 (request객체 없음)
		// return "atom/a1"; 시 controller에서 views 폴더 밑에 있는 atom 폴더의 a1.jsp로 이동
	
	private String genderCheck(String name) {
		String gender = "";
		if(name.equals("홍길동")) gender = "남자";
		else if(name.equals("김말숙")) gender = "여자";
		
		return gender;
	}

	@RequestMapping(value = "/a2", method = RequestMethod.GET)
	public String a2Get(Model model, @RequestParam(name="name", defaultValue = "", required = false) String name) {
		// @RequestParam : null 값 및 초기값 처리 jsp에서 Request.getParameter
		// spring의 처리 방법 ==> 장점은 넘어온 숫자 데이터 처리를 할 필요 x
		
		model.addAttribute("data", "a2에서 가네요");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		return "atom/a2";
	}
	@RequestMapping(value = "/a3", method = RequestMethod.GET)
	public String a3Get(Model model, String name) {
		model.addAttribute("data", "a3에서 가네요");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		return "atom/a3";
	}	
}
