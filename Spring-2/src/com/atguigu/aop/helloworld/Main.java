package com.atguigu.aop.helloworld;

public class Main {
	
	public static void main(String[] args) {
		
		Person target = new Student();
		
		Person proxy = new PersonLoggingProxy(target).getLoggingProxy();
		
		proxy.info();
		

	}

}
