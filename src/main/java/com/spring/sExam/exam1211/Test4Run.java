package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test4.xml");
		
		Test4VO vo = new Test4VO();
		vo.getService().printLine();
		vo.getService().printTitle();
		vo.getService().printLine();
		
		Test4VO vo1 = (Test4VO) ctx.getBean("vo1");
		vo.getService().calc(vo1);
		vo.getService().printSungjuk(vo1);
		
		Test4VO vo2 = (Test4VO) ctx.getBean("vo1");
		vo.getService().calc(vo1);
		vo.getService().printSungjuk(vo1);
		
		Test4VO vo3 = (Test4VO) ctx.getBean("vo1");
		vo.getService().calc(vo1);
		vo.getService().printSungjuk(vo1);
	
		vo.getService().printLine();
	}
}
