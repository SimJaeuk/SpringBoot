package com.example.demo.bean;

public class PrinterB implements Printer {
	
	@Override // ������̼� : �����Ϸ����� ������ �˷��ְų� �߰����� ���ø� �ϴ� ���þ�
	public void print(String message) {
		
		System.out.println("Printer B:" + message);
	}
}
