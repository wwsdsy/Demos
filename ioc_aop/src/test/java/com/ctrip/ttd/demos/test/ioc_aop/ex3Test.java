package com.ctrip.ttd.demos.test.ioc_aop;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ctrip.ttd.demos.demo_ioc.ex3.*;

public class ex3Test {

	FileSystemXmlApplicationContext _context = null;

	@Before
	public void init() {
		_context = new FileSystemXmlApplicationContext("/src/ex3_ioc.xml");
	}

	//@Test
	public void test() {
		ISayHello _sayHello = (ISayHello) _context.getBean("SayHello");
		assertEquals("你好  , 钱晓", _sayHello.SayHelloTo("钱晓"));
		_context.close();
	}

	//@Test
	public void test2() {
		ISayHello _sayHello = (ISayHello) _context.getBean("SayHello2");
		assertEquals("Hello , qian.x", _sayHello.SayHelloTo("qian.x"));
		_context.close();
	}
	
	@Test
	public void test3() {
		ISayHello _sayHello = (ISayHello) _context.getBean("SayHello3");
		assertEquals("Hello , qian.x", _sayHello.SayHelloTo("qian.x"));
		_context.close();
	}
	
	//@Test
	public void test4() {
		ISayHello _sayHello = (ISayHello) _context.getBean("SayHello4");
		assertEquals("Hello , qian.x", _sayHello.SayHelloTo("qian.x"));
		_context.close();
	}	
	
}
