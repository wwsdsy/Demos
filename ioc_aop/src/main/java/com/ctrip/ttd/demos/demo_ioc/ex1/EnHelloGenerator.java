package com.ctrip.ttd.demos.demo_ioc.ex1;

public class EnHelloGenerator {

	public String GetHelloString(String name){
		return String.format("Hello , %s", name);
	}
}
