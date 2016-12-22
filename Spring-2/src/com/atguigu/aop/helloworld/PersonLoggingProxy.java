package com.atguigu.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ���Զ�̬������ִ��Person ��info ����ǰ�� �����־
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

		// ����������ĸ���������������
		ClassLoader loader = target.getClass().getClassLoader();

		Class[] interfaces = new Class[] { Person.class };

		// �����ô���������еķ����ǣ���ִ�еĴ���
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {

				String methodName = method.getName();
				//��־
				System.out.println("The method:" + methodName+" begins....");
				//ִ�з���
				Object result = method.invoke(target, args);
				System.out.println("The method:" + methodName +" ends...");
				return result;
				
			}
		};

		proxy = (Person) Proxy.newProxyInstance(loader, interfaces, h);

		return proxy;
	}

}
