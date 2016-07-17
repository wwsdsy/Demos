package com.ctrip.ttd.demos.demo_ioc.ex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {

	@Pointcut("execution(* com.ctrip.ttd.demos.demo_ioc.ex3.SayHello.*(..))")
	public void Aspect() {

	}

	@Before("Aspect()")
	public void before(JoinPoint joinPoint) {
		System.out.println("=============== test before ===============");
	}

	@Around(value = "Aspect()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("-----aroundAdvice().invoke-----");
		System.out.println(" 此处可以做类似于Before Advice的事情");

		// 调用核心逻辑
		Object retVal = pjp.proceed();
		System.out.println(" 此处可以做类似于After Advice的事情");
		System.out.println("-----End of aroundAdvice()------");
		return retVal;
	}
}
