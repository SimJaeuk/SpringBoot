package com.example.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

// �������̽� ������ XML�� �ϰڴٴ� �ǹ� -> xml�� sql����ڴٴ� �ǹ�
@Mapper
public interface IMyUserDao {
	List<MyUserDTO> list();  // ���̺��� ������ select�ϱ� ���� �޼ҵ�
	
}
