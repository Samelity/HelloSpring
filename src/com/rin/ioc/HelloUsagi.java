package com.rin.ioc;

public class HelloUsagi {
	private String message;
	private String usagi;

	public void getMessage() {
		System.out.println("Usagi Message:" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getUsagi() {
		System.out.println(usagi);
	}

	public void setUsagi(String usagi) {
		this.usagi = usagi;
	}
	
}
