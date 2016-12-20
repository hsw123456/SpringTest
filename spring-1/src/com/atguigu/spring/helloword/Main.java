package com.atguigu.spring.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		/*//创建Helloworld 对象
		HelloWorld helloworld  = new HelloWorld();
		//为该对象赋值
		helloworld.setName("Spring");
		
		//调用hello 方法
		helloworld.hello();*/
		
		//创建Helloworld 对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");
//		//调用hello 方法
//		helloworld.hello();
	}

}
