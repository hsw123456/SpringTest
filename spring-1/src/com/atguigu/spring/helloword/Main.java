package com.atguigu.spring.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		/*//����Helloworld ����
		HelloWorld helloworld  = new HelloWorld();
		//Ϊ�ö���ֵ
		helloworld.setName("Spring");
		
		//����hello ����
		helloworld.hello();*/
		
		//����Helloworld ����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");
//		//����hello ����
//		helloworld.hello();
	}

}
