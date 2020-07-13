package org.Spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class Shape {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		System.out.println(triangle);
	}

}
