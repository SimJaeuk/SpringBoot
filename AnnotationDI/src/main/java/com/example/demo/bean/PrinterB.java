package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("printerB") // �Ʒ��� ������ Ŭ���� PrinterBŬ������ ������ ����ϰڴٴ� �ǹ�
public class PrinterB implements Printer {
	
	@Override // ������̼� : �����Ϸ����� ������ �˷��ְų� �߰����� ���ø� �ϴ� ���þ�
	public void print(String message) {
		
		System.out.println("Printer B:" + message);
	}
}
