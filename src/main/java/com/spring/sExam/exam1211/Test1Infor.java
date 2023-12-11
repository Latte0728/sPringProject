package com.spring.sExam.exam1211;

import lombok.Data;

@Data // lombok을 사용해서 Getter 와 Setter를 생성
public class Test1Infor {
	private String driver; // connection 과 pstmt 연결을 위해 필요
	private String url;
	private String user;
	private String password;

	
}
