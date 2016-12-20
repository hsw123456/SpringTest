package com.atguigu.spring.helloword;

public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		System.out.println("helloWorld's setName method.." + name);
		this.name = name;
	}
	
	
	public void hello(){
		System.out.println("HelloWorld:" + name);
	}
	
	public HelloWorld() {
		System.out.println("HelloWord's Constructor ....");
	}

}
