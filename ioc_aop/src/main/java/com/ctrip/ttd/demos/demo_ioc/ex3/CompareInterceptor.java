package com.ctrip.ttd.demos.demo_ioc.ex3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object _result = null;
		String _name = arg0.getArguments()[0].toString();
		if (_name.equals("qian.x")) {
			_result = arg0.proceed();
		} else {
			System.out.println("say action denied!");
		}
		return _result;
	}
}
