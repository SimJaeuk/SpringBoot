package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Config;
import com.example.demo.bean.Member;
import com.example.demo.bean.Printer;

// @SpringBootApplication // ������ ��Ʈ�� 
public class JavaDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JavaDiApplication.class, args);
		//�����̳� ����
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		//Member Bean ��������
		Member member1 = (Member)context.getBean("member1"); //���� ������ �� �����̳ʷκ��� ���� ���Ϲ޾Ƽ� ����ȯ�Ͽ� ���
		member1.print();

		//Member Bean �������� // config���� �� ������̼��� ������ �� ������ �̸��� �����ؼ� �� �̸����� ���� ��û�ϰ� ���� �޴� ���
		Member member2 = (Member)context.getBean("hello",Member.class);
		member2.print();
		
		//PrinterB Bean �������� �̸� ���� �����ؼ� ���� ���Ϲ޴� ���
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setprinter(printer);
		member1.print();
		
		if (member1 == member2) {
			System.out.println("������ ��ü�Դϴ�.");
		}else {
			System.out.println("���� �ٸ� ��ü�Դϴ�.");
		}
		
	}

}

// ������ ��Ʈ�� @SpringBootApplication ������̼ǿ� ���� �ڵ����� ������ �̷������ 
// ������Ʈ�� ��ϵȴ�. �ּ�ó���Ͽ� �ϴ� �ڵ������ ���Ҵ�.

// �ܼ� â���� �α׸� Ȯ���ϸ� �츮�� ���� Ŭ������ ������ ��ϵ� ���� Ȯ�� �� �� �ִ�.
// ������ ���� ������ �����̳ʿ��� �⺻������ ��ü ������ �����ȴ�.

// ��ϵ� ���� �����ͼ� ����� ����. Ŭ������ �����ؼ� ������ ���� �ְ�
// �������� ��������ȯ�� ����� ���� �ִ�.
