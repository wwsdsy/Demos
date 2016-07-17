package com.ctrip.ttd.demos.demo_ioc.ex3;

public class SayHello implements ISayHello {

	private IHelloGenerator _helloGenerator;

	public SayHello(IHelloGenerator helloGenerator) {
		_helloGenerator = helloGenerator;
	}

	public String SayHelloTo(String name) {
		if (_helloGenerator != null)
			return _helloGenerator.GetHelloString(name);
		else
			return "没有初始化";
	}

}
