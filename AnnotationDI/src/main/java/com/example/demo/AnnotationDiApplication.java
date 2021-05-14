package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationDiApplication.class, args);
	}

}


// @SpringBootApplication ������̼��� ������ ����� �����Ѵ�.
// 1. @Configuration Bean�� ������ �� �ѹ��� �����Ѵ�. �׸��� ���� ������ �����Ѵ�.
// 2. @EnableAutoConfiguration ������ �� ���ؽ�Ʈ(Application Context)�� ���� �� �ڵ� ����
// 							����ڰ� �ʿ��� �� ���� ���� �����ؼ� �ڵ����� �ʿ��� ������ �Ѵ�.
// 3. @ComponentScan ������ ��ġ ���Ͽ� �ִ� @Component�� @Configuration �� ���� Ŭ������ ������ ���

// ���α׷��� ���� ����Ǹ� AnnotationDiApplication�� main�޼ҵ尡 ���� ���� ����ȴ�.
// �� �� Ŭ�������� ������ @SpringBootApplication ������̼��� ���� �ڵ����� ���� �˻��ϰ� ����� ��
// main�޼ҵ��� SpirngApplication.run�� ���ؼ� ���� ��Ĺ�� ������ �� �ڵ����� webApplicationContext�� ����
// ������ ��Ʈ�� ���� ��ĵ�� ���� ������̼��� �����Ǿ��ִ� Ŭ�������� ã�Ƽ� ������ ����Ѵ�.
// �� �� PirntA�� PrintB�� @Component ������̼ǿ� ���� ���� �̸��� �߰������� �Է��ߴ�.
// �̷��� �Էµ� �̸��� ���� �̸����� ���ǰ� Memberó�� ���� �̸��� �Է����� �ʰ� @Component ������̼Ǹ�
// �����ϸ� Ŭ������ �̸��� ù ���ڸ� �ҹ��ڷ��� Ŭ������ �̸��� ���� �̸��� �ȴ�.