package com.rin.comment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierTest {
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public QualifierTest() {
		System.out.println("Qualifier测试的构造方法！");
	}
	
	public void getMessage() {
		System.out.println("学生姓名："+student.getName());
		System.out.println("学生年龄："+student.getAge());
	}
	
	@PostConstruct
	public void init() {
		System.out.println("初始化注释！");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("销毁注释！");
	}

}
