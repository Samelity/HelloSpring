package com.rin.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class IoCMain {
	public static void main(String[] args) {
//		applicationContextSample();
//		fileSystemSample();
//		beansFactorySample();
//		singletonSample();
//		prototypeSample();
		exampleSample();
	}
	
	//ApplicationContext的IOC容器
	protected static void applicationContextSample() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoCBeans.xml");
//		HelloWorld hw = (HelloWorld) context.getBean("applicationContext");
//		hw.getMessage();
		HelloUsagi hu = (HelloUsagi) context.getBean("usagi");
		hu.getMessage();
		hu.getUsagi();
	}
	
	protected static void fileSystemSample() {
		ApplicationContext context = new FileSystemXmlApplicationContext("D:/greencloud_dev/spring/HelloSpring/src/IoCBeans.xml");
		HelloWorld hw = (HelloWorld) context.getBean("applicationContext");
		hw.getMessage();
	}
	
	//BeansFactory的IOC容器
	protected static void beansFactorySample() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("IoCBeans.xml"));
		HelloWorld hw = (HelloWorld) beanFactory.getBean("beansFactory");
		hw.getMessage();
	}
	
	//Singleton测试
	protected static void singletonSample() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoCBeans.xml");
		HelloWorld hw1 = (HelloWorld) context.getBean("singleton");
		hw1.getMessage();
		
		HelloWorld hw2 = (HelloWorld) context.getBean("singleton");
		hw2.setMessage("this is singleton hw2 set data!");
		hw2.getMessage();
		
		hw1.getMessage();
	}
	
	//Prototype测试
	protected static void prototypeSample() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoCBeans.xml");
		HelloWorld hw1 = (HelloWorld) context.getBean("prototype");
		hw1.getMessage();
		
		HelloWorld hw2 = (HelloWorld) context.getBean("prototype");
		hw2.setMessage("this is prototype hw2 set data!");
		hw2.getMessage();
		
		hw1.getMessage();
	}
	
	protected static void exampleSample() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("IoCBeans.xml");
		ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
		exampleBean.getMessage();
		context.registerShutdownHook();
		//context.close();
	}
	
}
