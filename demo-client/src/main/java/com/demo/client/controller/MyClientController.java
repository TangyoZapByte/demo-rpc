package com.demo.client.controller;

import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import com.demo.api.service.MyFirstDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClientController {
	@CloudReference
	private MyFirstDemo myFirstDemo;

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello(){
		return myFirstDemo.sayHello();
	}
}