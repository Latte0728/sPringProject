package com.spring.sExam.exam1211;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/test3.xml");
		
		/*
		 * Test3VO vo1 = (Test3VO) ctx.getBean("vo1"); System.out.println("name : " +
		 * vo1.getName()); System.out.println("kor : " + vo1.getKor());
		 * System.out.println("eng : " + vo1.getEng()); System.out.println("mat : " +
		 * vo1.getMat()); System.out.println();
		 * 
		 * Test3VO vo2 = (Test3VO) ctx.getBean("vo1"); System.out.println("name : " +
		 * vo2.getName()); System.out.println("kor : " + vo2.getKor());
		 * System.out.println("eng : " + vo2.getEng()); System.out.println("mat : " +
		 * vo2.getMat()); System.out.println();
		 * 
		 * Test3VO vo3 = (Test3VO) ctx.getBean("vo1"); System.out.println("name : " +
		 * vo3.getName()); System.out.println("kor : " + vo3.getKor());
		 * System.out.println("eng : " + vo3.getEng()); System.out.println("mat : " +
		 * vo3.getMat()); System.out.println();
		 */
	
		 ArrayList<Test3VO> vos = new ArrayList<Test3VO>();
		 Test3VO vo = null;
		 
		 vo = (Test3VO) ctx.getBean("vo1");
		 vos.add(vo);
		 
		 vo = (Test3VO) ctx.getBean("vo2");
		 vos.add(vo);
		 
		 vo = (Test3VO) ctx.getBean("vo3");
		 vos.add(vo);
		 
		 Test3Service service = new Test3Service();
		 
		 service.printLine();
		 service.printTitle();
		 service.printLine();
	
		 for(Test3VO v : vos) {
			 service.calc(v);
			 service.printSungjuk(v);
		 }
		 service.printLine();
		 ctx.close();
	}
}
