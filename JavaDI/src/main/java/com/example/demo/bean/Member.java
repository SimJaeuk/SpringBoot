package com.example.demo.bean;

public class Member {
	private String name;
	private String nickname;
	private Printer printer;
	
	public Member() {}
	// 생성자가 2개, 기본 생성자와 3개 파라미터 받는 생성자
	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	public void setname(String name) {
		this.name = name;
	}

	public void setnickname(String nickname) {
		this.nickname = nickname;
	}

	public void setprinter(Printer printer) {
		this.printer = printer;
	}
	
	// 메소드 변수에 저장된 정보를 출력
	public void print() {
		printer.print("Hello " + name + " : " + nickname);;
	}
	
}
