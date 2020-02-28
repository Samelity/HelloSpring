package com.rin.comment;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	
	public String custom() {
		return "自定义事件！";
	}

}
