package com.example.demo.bean;

public class Member {
	private String name;
	private String nickname;
	private Printer printer;
	
	public Member() {}
	// �����ڰ� 2��, �⺻ �����ڿ� 3�� �Ķ���� �޴� ������
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
	
	// �޼ҵ� ������ ����� ������ ���
	public void print() {
		printer.print("Hello " + name + " : " + nickname);;
	}
	
}
