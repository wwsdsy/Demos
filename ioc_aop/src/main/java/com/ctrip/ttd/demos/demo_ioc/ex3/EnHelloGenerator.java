package com.ctrip.ttd.demos.demo_ioc.ex3;

public class EnHelloGenerator implements IHelloGenerator {

	public String GetHelloString(String name){
		return String.format("Hello , %s", name);
	}
}
