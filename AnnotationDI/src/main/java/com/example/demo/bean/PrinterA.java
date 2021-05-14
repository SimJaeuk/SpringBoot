package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("printerA") // �Ʒ��� ������ Ŭ���� PrinterAŬ������ ������ ����ϰڴٴ� �ǹ�
public class PrinterA implements Printer {
	
	@Override // ������̼� : �����Ϸ����� ������ �˷��ְų� �߰����� ���ø� �ϴ� ���þ�
	public void print(String message) {
		
		System.out.println("Printer A:" + message);
	}
}


// �θ� Ŭ������ �������̽��κ��� ������̼� �ٷ� ���� �޼ҵ带 �������̵�(�����) �ߴ�.
// ������̼� ���� �����ڰ� �޼ҵ带 ���� �Է��Ͽ� �������̵� �ߴµ�
// �޼ҵ� �̸��� ��Ÿ�� �´ٸ� �������̵� �Ѱ� �ƴ϶� �׳� ���ο� �޼ҵ�� �ν��ϰ� �ȴ�.
// �޼ҵ忡 @Override ������̼��� �����ϸ� �θ�Ŭ������ �������̽��� �ش� �޼ҵ尡 ���� �� 
// ����ó���� �Ͽ� �������� �Ǽ��� ������ �� �ִ�.