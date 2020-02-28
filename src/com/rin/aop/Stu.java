package com.rin.aop;

public class Stu {
	private String name;
	private int age;
	
	public String getName() {
		System.out.println("姓名："+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("年龄："+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printEX() {
		System.out.println("异常打印功能。");
		throw new IllegalArgumentException();
	}
	
}
