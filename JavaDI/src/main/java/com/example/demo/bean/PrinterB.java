package com.example.demo.bean;

public class PrinterB implements Printer {
	
	@Override // 어노테이션 : 컴파일러에게 정보를 알려주거나 추가적인 지시를 하는 지시어
	public void print(String message) {
		
		System.out.println("Printer B:" + message);
	}
}
