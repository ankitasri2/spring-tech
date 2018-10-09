package com.teach.ioc;

public class HelloWorld {
	//private String name;
	HelloMessage helloMessage;
	

	public HelloWorld(HelloMessage helloMessage) {
		super();
		this.helloMessage = helloMessage;
	}

	public void printHello() {
		System.out.println("Hello :"+ helloMessage.getDisplayMessage());
	}
	
}
