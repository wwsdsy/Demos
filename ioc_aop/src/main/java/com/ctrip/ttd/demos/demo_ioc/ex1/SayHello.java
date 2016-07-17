package com.ctrip.ttd.demos.demo_ioc.ex1;

public class SayHello {
	private EnHelloGenerator _enHelloGenerator;

	public String SayHelloTo(String name) {
		if (_enHelloGenerator != null)
			return _enHelloGenerator.GetHelloString(name);
		else
			return "not initialized";
	}

	public void SetEnHelloGenerator(EnHelloGenerator enHelloGenerator) {
		_enHelloGenerator = enHelloGenerator;
	}

	public EnHelloGenerator GetEnHelloGenerator() {
		return _enHelloGenerator;
	}
}
