package com.sayali.spring.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sayali.spring.springAOP.ProductServies;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sayali/spring/springAOP/test/lcconfig.xml");
		ProductServies product = (ProductServies) ctx.getBean("ProductServies");
		System.out.println(product.multiply(4, 5));
	}

}
