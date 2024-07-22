package com.demo.api.service;

import com.hundsun.jrescloud.rpc.annotation.CloudFunction;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService
public interface MyFirstDemo{
    @CloudFunction("33333")
    String sayHello();
}