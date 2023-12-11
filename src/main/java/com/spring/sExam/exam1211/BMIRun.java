package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
�񸸵�(BMI) ����ϴ� ���α׷��� ����ÿ�.
���� : ������ / (Ű����� * Ű�����)
��) Ű:170Cm, ������:65Kg
   ������ ���ϴ� ���� : 65 / (1.7 * 1.7)
   �������� ���� ����?
     ��ü��: 18.5�̸�, ǥ�� : 18.5~23 , ��ü��:23~25, ��:25�ʰ�
   
   �������� ������ xml�� ���ؼ� ó���Ѵ�.(�Է°� : ��������, ���κ� ����/Ű/������)
*/

public class BMIRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmi.xml");
		
		BMIVO vo = new BMIVO();
		vo.getService().printLine();
		
		BMIVO[] bmis = {(BMIVO) ctx.getBean("person1"),(BMIVO) ctx.getBean("person2"),(BMIVO) ctx.getBean("person3")};
	
		for(BMIVO v : bmis) {
			v.getService().calc(v);
			v.getService().printLine();
		}
				
		ctx.close();
	}
}

/*
 * public class BMIRun { public static void main(String[] args) {
 * 
 * ClassPathXmlApplicationContext ctx = new
 * ClassPathXmlApplicationContext("xml/bmi.xml");
 * 
 * BMIVO vo = new BMIVO(); vo.getService().printLine();
 * vo.getService().printTitle(); vo.getService().printLine();
 * 
 * BMIVO vo1 = (BMIVO) ctx.getBean("vo"); vo.getService().calc(vo);
 * vo.getService().printBMI(vo); } }
 */