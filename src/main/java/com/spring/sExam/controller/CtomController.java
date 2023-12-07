package com.spring.sExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctom")
public class CtomController {
	@RequestMapping(value="/c1", method = RequestMethod.GET)
	public String c1Get(@RequestParam(name="flag", defaultValue="", required = false)String flag) {
		if(!flag.equals("")) {
			System.out.println("c1Service2�� �ٳ�Խ��ϴ�.");
		}
		return "ctom/c1";
	}

	@RequestMapping(value="/c1Service", method = RequestMethod.GET)
	public String c1ServiceGet() {
		System.out.println("�̰��� c1Service �Դϴ�.");
		System.out.println("���� �۾����Դϴ�...");
		System.out.println("�۾��� �Ϸ�Ǿ����ϴ�.!!!");
//		return "ctom/c1";
	
		return "redirect :/ctom/c1";
	}
	@RequestMapping(value="/c2Service", method = RequestMethod.GET)
	public String c2ServiceGet() {
		System.out.println("�̰��� c2Service �Դϴ�.");
		System.out.println("���� �۾����Դϴ�...");
		System.out.println("�۾��� �Ϸ�Ǿ����ϴ�.!!!");
		//return "redirect:/ctom/c1";
		return "redirect:/ctom/c1?flag=OK";
	}
}
