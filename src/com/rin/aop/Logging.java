package com.rin.aop;

public class Logging {
	
	public void beforeAdvice() {
		System.out.println("学生数据加载...");
	}
	
	public void afterAdvice() {
		System.out.println("学生数据加载完毕。");
	}
	
	public void afterReturnAdvice(Object res) {
		System.out.println("返回值为："+res.toString());
	}
	
	public void throwEXAdvice(Exception ex) {
		System.out.println("异常："+ex.toString());
	}
}
