package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Config;
import com.example.demo.bean.Member;
import com.example.demo.bean.Printer;

// @SpringBootApplication // 스프링 부트는 
public class JavaDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JavaDiApplication.class, args);
		//컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		//Member Bean 가져오기
		Member member1 = (Member)context.getBean("member1"); //빈을 가져올 때 컨테이너로부터 빈을 리턴받아서 형변환하여 사용
		member1.print();

		//Member Bean 가져오기 // config에서 빈 어노테이션을 지정할 때 별도의 이름을 지정해서 그 이름으로 빈을 요청하고 리턴 받는 방법
		Member member2 = (Member)context.getBean("hello",Member.class);
		member2.print();
		
		//PrinterB Bean 가져오기 미리 형을 지정해서 빈을 리턴받는 방법
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setprinter(printer);
		member1.print();
		
		if (member1 == member2) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
	}

}

// 스프링 부트는 @SpringBootApplication 어노테이션에 의해 자동으로 설정이 이루어지고 
// 컴포넌트가 등록된다. 주석처리하여 일단 자동등록을 막았다.

// 콘솔 창으로 로그를 확인하면 우리가 만든 클래스가 빈으로 등록된 것을 확인 할 수 있다.
// 생성된 빈은 스프링 컨테이너에서 기본적으로 객체 생성이 제공된다.

// 등록된 빈을 가져와서 사용해 보자. 클래스를 지정해서 가져올 수도 있고
// 가져오고 나서형변환을 사용할 수도 있다.
