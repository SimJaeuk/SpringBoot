package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 아래의 클래스 Member를 빈으로 등록한다는 의미 
public class Member {
	@Value("홍길동") // 빈이 생성될 때 name변수의 기본값을 "홍길동"으로 지정
	private String name;
	@Value("도사") // 빈이 생성될 때 name변수의 기본값을 "도사"으로 지정
	private String nickname;
	
	@Autowired // 빈이 생성될 때 printer변수가 참조할 객체를 자동으로 지정
	@Qualifier("printerA") // 유사한 객체가 여러개 일 때 빈의 이름으로 정화갛게 지정
	private Printer printer;
	
	
	// Member 클래스는 생성자를 통한 값 주입과 생성이후 새터를 통한 값의 주입이 가능하도록 코딩됨
	// @Value 어노테이션은 세터의 역할을 수행한다. 객체가 생성될 때 값을 가지고 만들 수 있도록 값의 지정 기능
	// 생성된 후에도 바꿀일이 있으면 세터부분의 코드 필요 없이 프로그램 수행 중에 내용이 바뀌어야 한다면 변경 가능하다.
	// @Autowired 어노테이션은 해당 클래스의 객체를 자동으로 찾아서 연결한다. 컨테이너에 등록된 빈들 중에서
	// 사용할 수 있는 객체를 찾아서 자동으로 연결해 준다. PrinterA, printerB 처럼 유사한 클래스가
	// 여러개 있는 경우 @Qualifier 어노테이션을 통해 이름을 명확하게 지정해 주어야 한다.
	
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
