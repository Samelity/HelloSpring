package com.rin.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean,DisposableBean {
	private String message;

	public void getMessage() {
		System.out.println("Your message:"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("it's InitializingBean AfterPropertiesSet!");
	}
	
	protected void initMethod() {
		System.out.println("it's init method!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("it's DisposableBean destroy!");
	}
	
	protected void destroyMethod() {
		System.out.println("it's destroy method!");
	}
	
}
