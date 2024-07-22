package com.demo.server.impl;

import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import com.demo.api.service.MyFirstDemo;

@CloudComponent
public class MyFirstDemoImpl implements MyFirstDemo {

	public String sayHello() {
		return "Hello Hundsun";
	}

}