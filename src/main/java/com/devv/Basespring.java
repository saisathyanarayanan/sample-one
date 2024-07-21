package com.devv;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Basespring {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Laptop z = context.getBean("laptop",Laptop.class);
		System.out.println(z.getlapname());
		System.out.println(z.getlapprice());
		System.out.println(z.getlall());
		
		System.out.println("helllo this is kumar");
	}

}
