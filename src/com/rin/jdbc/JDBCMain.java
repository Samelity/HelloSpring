package com.rin.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("JDBCBeans.xml");
		StudentJDBCTemplate sTemplate = (StudentJDBCTemplate) context.getBean("sTemp");
		sTemplate.create("宫森葵", 27, 66, 2020);
		sTemplate.create("安原绘麻", 27, 77, 2020);

		List<Students> students = sTemplate.listStudents();
		for (Students student : students) {
			System.out.print("ID : " + student.getId());
			System.out.print(", Name : " + student.getName());
			System.out.println(", Age : " + student.getAge());
		}
		
		sTemplate.update(2, "今井绿", 25);
		
		Students student = sTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}
}
