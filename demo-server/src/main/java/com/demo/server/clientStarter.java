package com.demo.server;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;

@CloudApplication
public class clientStarter {
    public static void main(String[] args){
        CloudBootstrap.run(clientStarter.class, args);
    }
}