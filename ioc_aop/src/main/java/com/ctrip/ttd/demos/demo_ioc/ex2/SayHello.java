package com.ctrip.ttd.demos.demo_ioc.ex2;

public class SayHello implements ISayHello {

	private IHelloGenerator _helloGenerator;
	public String SayHelloTo(String name) {
		if (_helloGenerator != null)
			return _helloGenerator.GetHelloString(name);
		else
			return "没有初始化";
	}

	public IHelloGenerator GetHelloGenerator() {
		return _helloGenerator;
	}

	public void SetHelloGenerator(IHelloGenerator helloGenerator) {
		_helloGenerator = helloGenerator;
	}

}
