package com.atguigu.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试动态代理，在执行Person 的info 方法前后 添加日志
 * 
 * @author Administrator
 * 
 */
public class PersonLoggingProxy {

	private Person target;

	public PersonLoggingProxy(Person targert) {
		super();
		this.target = targert;
	}

	public Person getLoggingProxy() {

		Person proxy = null;

		// 代理对象由哪个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();

		Class[] interfaces = new Class[] { Person.class };

		// 当调用代理对象其中的方法是，该执行的代码
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {

				String methodName = method.getName();
				//日志
				System.out.println("The method:" + methodName+" begins....");
				//执行方法
				Object result = method.invoke(target, args);
				System.out.println("The method:" + methodName +" ends...");
				return result;
				
			}
		};

		proxy = (Person) Proxy.newProxyInstance(loader, interfaces, h);

		return proxy;
	}

}
