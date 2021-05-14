package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component("printerA") // 아래에 나오는 클래스 PrinterA클래스를 빈으로 등록하겠다는 의미
public class PrinterA implements Printer {
	
	@Override // 어노테이션 : 컴파일러에게 정보를 알려주거나 추가적인 지시를 하는 지시어
	public void print(String message) {
		
		System.out.println("Printer A:" + message);
	}
}


// 부모 클래스나 인터페이스로부터 어노테이션 바로 다음 메소드를 오버라이딩(덮어쓰기) 했다.
// 어노테이션 없이 개발자가 메소드를 직접 입력하여 오버라이딩 했는데
// 메소드 이름에 오타를 냈다면 오버라이딩 한게 아니라 그냥 새로운 메소드로 인식하게 된다.
// 메소드에 @Override 어노테이션을 지정하면 부모클래스나 인터페이스에 해당 메소드가 없을 때 
// 에러처리를 하여 개발자의 실수를 방지할 수 있다.