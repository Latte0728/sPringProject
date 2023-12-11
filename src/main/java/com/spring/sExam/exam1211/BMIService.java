package com.spring.sExam.exam1211;

public class BMIService {
	public void calc(BMIVO vo) {
		double dblHeight = vo.getHeight() / 100.0;
		double bmi = vo.getWeight() / (dblHeight * dblHeight);
		
		String str = "";
		if(bmi < 18.5) str = "���� ��ü�� �Դϴ�. ������ ������ ���� ���� ���� �弼��";
		else if(bmi <= 23) str = "���� ���� �Դϴ�. ������ �ǰ����� �� �ϼ���.";
		else if(bmi <= 25) str = "���� ��ü�� �Դϴ�. ���ݺ��Ͷ� ü�߰��� �� �ϼ���.";
		else str = "���� �� �Դϴ�. ���ĺ��⸦ ������ �϶�~~~~~ ������ ����ϼ���...";
		
	  System.out.println(vo.getName() + str);
	}

	public void printLine() {
		System.out.println("======================================================");
	}
}


/*
 * package com.spring.sExam.exam1211;
 * 
 * public class BMIService {
 * 
 * public BMIVO calc(BMIVO vo) { int height = 170; int weight = 65; double avg =
 * 170 /65 ; String BMI = ""; if(65/(1.7*1.7)<18.5) BMI = "��ü���Դϴ�."; else
 * if(65/(1.7*1.7) == 23 && 65/(1.7*1.7) == 25) BMI = "ǥ�� ü���Դϴ�."; else
 * if(25<65/(1.7*1.7)) BMI = "��ü���Դϴ�."; vo.setHeight(170); vo.setWeight(65);
 * return vo; } public void printLine() {
 * System.out.println("======================================================");
 * } public void printTitle() { System.out.println("����\t�� ����"); } }
 */