package com.spring.sExam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/atom")
// �߰� ��� �Ǵ� �߰� ��� 

public class AtomController {
	
	@RequestMapping(value={"/a1","/atom1"}, method = RequestMethod.GET)
	public String a1Get(Model model, HttpServletRequest request) {
		// a1Get �̶�� ������ ���� �޼ҵ���� �ߺ� �ȵ�
		
		String name = request.getParameter("name")==null? "" : request.getParameter("name");
		
		model.addAttribute("data","a1���� ���ϴ�.");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		
		
		return "atom/a1";
	}
		// public String a1Get()�� String�̶� ���ڿ��� return ������ �;ߵ�
		// return �ڿ� �Ѱ��� �� �̸�
		// String�϶��� model�� �Ѱܾ� �� model��ü�� �������̶�� spring���� �ǰ���
		// ���� �޼ҵ忡�� request ��� �Ұ� (request��ü ����)
		// return "atom/a1"; �� controller���� views ���� �ؿ� �ִ� atom ������ a1.jsp�� �̵�
	
	private String genderCheck(String name) {
		String gender = "";
		if(name.equals("ȫ�浿")) gender = "����";
		else if(name.equals("�踻��")) gender = "����";
		
		return gender;
	}

	@RequestMapping(value = "/a2", method = RequestMethod.GET)
	public String a2Get(Model model, @RequestParam(name="name", defaultValue = "", required = false) String name) {
		// @RequestParam : null �� �� �ʱⰪ ó�� jsp���� Request.getParameter
		// spring�� ó�� ��� ==> ������ �Ѿ�� ���� ������ ó���� �� �ʿ� x
		
		model.addAttribute("data", "a2���� ���׿�");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		return "atom/a2";
	}
	@RequestMapping(value = "/a3", method = RequestMethod.GET)
	public String a3Get(Model model, String name) {
		model.addAttribute("data", "a3���� ���׿�");
		model.addAttribute("name",name);
		
		String gender = genderCheck(name);
		model.addAttribute("gender", gender);
		return "atom/a3";
	}	
}
