package com.ctrip.ttd.demos.demo_ioc.ex3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class beforeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("========这是BeforeAdvice类的before方法.========");
	}
}
