package com.rin.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPBeans.xml");
		Stu stu = (Stu) context.getBean("stu");
		stu.getName();
		stu.getAge();
//		stu.printEX();
	}
}
