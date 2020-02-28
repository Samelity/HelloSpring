package com.rin.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DIBeans.xml");
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.editor();
		
		TextEditorPro textEditorPro = (TextEditorPro) context.getBean("textEditorPro");
		textEditorPro.editor();
	}
}
