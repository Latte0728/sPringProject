package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx	= new ClassPathXmlApplicationContext("xml/test1.xml");
	
		Test2Infor infor = (Test2Infor) ctx.getBean("infor");
		
		System.out.println("이곳은 생성자를 통해서 값을 주입함...");
		System.out.println("driver : " + infor.getDriver());
		System.out.println("url : " + infor.getUrl());
		System.out.println("user : " + infor.getUser());
		System.out.println("password" + infor.getPassword());
		// 실무에서 많이 사용
	}
}
