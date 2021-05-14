package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //������ �������� ������ �ǹ��Ѵ�.
public class Config {
	//��(bean) : SPring�� �����ϴ� ��ü
	//�� ���丮(BeanFactory) : �������� ����ϴ� �ٽ� �����̳�
	//���ø����̼� ���ؽ�Ʈ(ApplicationContext): ���� ���丮�� Ȯ���� �����̳�
	
	@Bean  //Bean������̼��� ���� �޼ҵ��� ���ϰ��� ���� ��ü�� ������ �ǹ��Ѵ�.
	public Member member1() {
		//setter�޼ҵ带 �̿��� ������ ����
		Member member1 = new Member();
		member1.setname("ȫ�浿");
		member1.setnickname("����");
		member1.setprinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello") //������̼ǿ� �̸��� �ָ� �ش� Ŭ������ ������ ����� �� �Է��� �̸����� ���� �̸��� ������ �� �ִ�.
	public Member member2() {
		//�����ڸ� �̿��� ������ ����
		return new Member("����ġ","����",new PrinterA());
	}

	@Bean
	public PrinterA printerA() {
		//������ �̸��� ���� ������ �޼ҵ� �̸��� ���� �̸����� ��ϵȴ�.
		return new PrinterA();
	}
	
	@Bean 
	public PrinterB printerB() {
		return new PrinterB();
	}
}