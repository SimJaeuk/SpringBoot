package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // �Ʒ��� Ŭ���� Member�� ������ ����Ѵٴ� �ǹ� 
public class Member {
	@Value("ȫ�浿") // ���� ������ �� name������ �⺻���� "ȫ�浿"���� ����
	private String name;
	@Value("����") // ���� ������ �� name������ �⺻���� "����"���� ����
	private String nickname;
	
	@Autowired // ���� ������ �� printer������ ������ ��ü�� �ڵ����� ����
	@Qualifier("printerA") // ������ ��ü�� ������ �� �� ���� �̸����� ��ȭ���� ����
	private Printer printer;
	
	
	// Member Ŭ������ �����ڸ� ���� �� ���԰� �������� ���͸� ���� ���� ������ �����ϵ��� �ڵ���
	// @Value ������̼��� ������ ������ �����Ѵ�. ��ü�� ������ �� ���� ������ ���� �� �ֵ��� ���� ���� ���
	// ������ �Ŀ��� �ٲ����� ������ ���ͺκ��� �ڵ� �ʿ� ���� ���α׷� ���� �߿� ������ �ٲ��� �Ѵٸ� ���� �����ϴ�.
	// @Autowired ������̼��� �ش� Ŭ������ ��ü�� �ڵ����� ã�Ƽ� �����Ѵ�. �����̳ʿ� ��ϵ� ��� �߿���
	// ����� �� �ִ� ��ü�� ã�Ƽ� �ڵ����� ������ �ش�. PrinterA, printerB ó�� ������ Ŭ������
	// ������ �ִ� ��� @Qualifier ������̼��� ���� �̸��� ��Ȯ�ϰ� ������ �־�� �Ѵ�.
	
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
