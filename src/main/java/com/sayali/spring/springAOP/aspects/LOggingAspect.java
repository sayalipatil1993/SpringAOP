package com.sayali.spring.springAOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LOggingAspect {

	@Before("execution(* com.sayali.spring.springAOP.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("inside logBefore method. before calling");
	}

	@After("execution(* com.sayali.spring.springAOP.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("after method invocation");
	}

}
