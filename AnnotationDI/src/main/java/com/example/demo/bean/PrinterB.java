package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("printerB") // 아래에 나오는 클래스 PrinterB클래스를 빈으로 등록하겠다는 의미
public class PrinterB implements Printer {
	
	@Override // 어노테이션 : 컴파일러에게 정보를 알려주거나 추가적인 지시를 하는 지시어
	public void print(String message) {
		
		System.out.println("Printer B:" + message);
	}
}
