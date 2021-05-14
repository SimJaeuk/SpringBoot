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

	@Autowired  // ���� ������ �� member1 ������ ������ ��ü�� �ڵ����� ã�ƿ´�.
	Member member1;
	@Autowired
	@Qualifier("printerB") // ���簲 ����ü printerA, printerB�� �������� �� ��Ȯ�� ã�� ����
	Printer printer;
	@Autowired
	Member member2;
	
	@RequestMapping("/") //����ڰ� ������ /�� get����� urlȣ���� �ϸ� root() ����
	public @ResponseBody String root() {
		// @ResponseBody ������̼��� Json�̳� xml� ������ ��� �ٸ�����
		// html�±� ���� �����ϰ� ��Ʈ�� �����͸����� ������ �� ��� �����Ѵ�.
	
	//Member Bean ��������
		//	Member member1 = (Member)Content.getBean("member1"); //���� ������ �� �����̳ʷκ��� ���� ���Ϲ޾Ƽ� ����ȯ�Ͽ� ���
	member1.print();

	
	//PrinterB Bean �������� �̸� ���� �����ؼ� ���� ���Ϲ޴� ���
		//	Printer printer = context.getBean("printerB", Printer.class);
	member1.setprinter(printer);
	member1.print();
	
	if (member1 == member2) {
		System.out.println("������ ��ü�Դϴ�.");
	}else {
		System.out.println("���� �ٸ� ��ü�Դϴ�.");
	}
	return "Annotaiton ����ϱ�";
	}
}
