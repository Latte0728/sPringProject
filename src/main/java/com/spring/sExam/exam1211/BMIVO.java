package com.spring.sExam.exam1211;

import lombok.Data;

@Data
public class BMIVO {
		private String name;
		private int height;
		private int weight;
		private BMIService service = new BMIService() ;
		
		
}
