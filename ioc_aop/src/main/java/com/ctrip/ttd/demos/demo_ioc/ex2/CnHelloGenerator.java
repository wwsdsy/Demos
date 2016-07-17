package com.ctrip.ttd.demos.demo_ioc.ex2;

public class CnHelloGenerator implements IHelloGenerator {

	public String GetHelloString(String name) {
		return String.format("你好  , %s", name);
	}

}
