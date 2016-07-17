package com.ctrip.ttd.demos.test.ioc_aop;

import org.junit.Test;

import com.ctrip.ttd.demos.demo_ioc.ex2.*;
import static org.junit.Assert.*;

public class ex2Test {
	
	@Test
	public void Ex2Test() {
		ISayHello sayHello = new SayHello();
		sayHello.SetHelloGenerator(new CnHelloGenerator());
		assertEquals("你好  , 钱晓", sayHello.SayHelloTo("钱晓"));
	}
	
}
