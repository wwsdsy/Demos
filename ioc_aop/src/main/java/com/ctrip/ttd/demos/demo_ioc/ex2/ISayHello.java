package com.ctrip.ttd.demos.demo_ioc.ex2;

public interface ISayHello {
	IHelloGenerator GetHelloGenerator();
	void SetHelloGenerator(IHelloGenerator helloGenerator);
	String SayHelloTo(String name);
}
