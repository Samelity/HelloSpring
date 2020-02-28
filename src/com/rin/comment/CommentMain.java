package com.rin.comment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommentMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("CommentBeans.xml");
		context.start();
		QualifierTest qualifierTest = (QualifierTest) context.getBean("qualifier");
		qualifierTest.getMessage();
//		context.registerShutdownHook();
		CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
		customEventPublisher.upEvent();
		context.stop();
		context.close();
	}
}
