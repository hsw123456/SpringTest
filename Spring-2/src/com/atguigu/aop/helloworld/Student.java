package com.atguigu.aop.helloworld;

public class Student implements Person{
	private String name = "Hsw";

	@Override
	public void info() {
		System.out.println("My Name is :"+ name);
	}

}
