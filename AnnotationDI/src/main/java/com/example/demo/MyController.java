package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Member;
import com.example.demo.bean.Printer;

@Controller
public class MyController {

	@Autowired  // 빈이 생성될 때 member1 변수가 참조할 객체를 자동으로 찾아온다.
	Member member1;
	@Autowired
	@Qualifier("printerB") // 유사갛 ㄴ객체 printerA, printerB등 여러개일 때 정확히 찾게 지정
	Printer printer;
	@Autowired
	Member member2;
	
	@RequestMapping("/") //사용자가 브라우저 /로 get방식의 url호출을 하면 root() 실행
	public @ResponseBody String root() {
		// @ResponseBody 어노테이션은 Json이나 xml등에 응답할 경우 다른말로
		// html태그 없이 순수하게 스트링 데이터만으로 응답을 할 경우 지정한다.
	
	//Member Bean 가져오기
		//	Member member1 = (Member)Content.getBean("member1"); //빈을 가져올 때 컨테이너로부터 빈을 리턴받아서 형변환하여 사용
	member1.print();

	
	//PrinterB Bean 가져오기 미리 형을 지정해서 빈을 리턴받는 방법
		//	Printer printer = context.getBean("printerB", Printer.class);
	member1.setprinter(printer);
	member1.print();
	
	if (member1 == member2) {
		System.out.println("동일한 객체입니다.");
	}else {
		System.out.println("서로 다른 객체입니다.");
	}
	return "Annotaiton 사용하기";
	}
}
