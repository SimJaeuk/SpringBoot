package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationDiApplication.class, args);
	}

}


// @SpringBootApplication 어노테이션은 세가지 기능을 수행한다.
// 1. @Configuration Bean을 생성할 때 한번만 생성한다. 그리고 각종 설정을 세팅한다.
// 2. @EnableAutoConfiguration 스프링 앱 컨텍스트(Application Context)를 만들 때 자동 설정
// 							사용자가 필요할 것 같은 빈을 추측해서 자동으로 필요한 설정을 한다.
// 3. @ComponentScan 지정한 위치 이하에 있는 @Component와 @Configuration 이 붙은 클래스를 빈으로 등록

// 프로그램이 최초 실행되면 AnnotationDiApplication의 main메소드가 가장 먼저 실행된다.
// 이 때 클래스에서 지정된 @SpringBootApplication 어노테이션을 통해 자동으로 빈을 검색하고 등록한 후
// main메소드의 SpirngApplication.run을 통해서 내장 톰캣을 실행한 후 자동으로 webApplicationContext를 생성
// 스프링 부트가 오토 스캔에 의해 어노테이션이 지정되어있는 클래스들을 찾아서 빈으로 등록한다.
// 이 때 PirntA와 PrintB는 @Component 어노테이션에 의해 빈의 이름을 추가정보로 입력했다.
// 이렇게 입력된 이름이 빈의 이름으로 사용되고 Member처럼 빈의 이름을 입력하지 않고 @Component 어노테이션만
// 지정하면 클래스의 이름의 첫 글자를 소문자로한 클래스의 이름의 빈의 이름이 된다.