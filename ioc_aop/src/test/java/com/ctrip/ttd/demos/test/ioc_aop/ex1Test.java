package com.ctrip.ttd.demos.test.ioc_aop;

import org.junit.Test;

import com.ctrip.ttd.demos.demo_ioc.ex1.*;
import static org.junit.Assert.*;

public class ex1Test {
	
	@Test
	public void Ex1Test() {
		SayHello sayHello = new SayHello();
		sayHello.SetEnHelloGenerator(new EnHelloGenerator());
		assertEquals("Hello , qian.x", sayHello.SayHelloTo("qian.x"));
	}
	
}
