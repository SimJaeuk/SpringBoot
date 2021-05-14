package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //스프링 설정으로 사용됨을 의미한다.
public class Config {
	//빈(bean) : SPring이 관리하는 객체
	//빈 팩토리(BeanFactory) : 스프링이 담당하는 핵심 컨테이너
	//어플리케이션 컨텍스트(ApplicationContext): 빈의 팩토리를 확장한 컨테이너
	
	@Bean  //Bean어노테이션이 붙은 메소드의 리턴값은 빈의 객체로 사용됨을 의미한다.
	public Member member1() {
		//setter메소드를 이용한 의존성 주입
		Member member1 = new Member();
		member1.setname("홍길동");
		member1.setnickname("도사");
		member1.setprinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello") //어노테이션에 이름을 주면 해당 클래스를 빈으로 등록할 때 입력한 이름으로 빈의 이름을 변경할 수 있다.
	public Member member2() {
		//생성자를 이용한 의존성 주입
		return new Member("전우치","도사",new PrinterA());
	}

	@Bean
	public PrinterA printerA() {
		//별도의 이름을 주지 않으면 메소드 이름이 빈의 이름으로 등록된다.
		return new PrinterA();
	}
	
	@Bean 
	public PrinterB printerB() {
		return new PrinterB();
	}
}