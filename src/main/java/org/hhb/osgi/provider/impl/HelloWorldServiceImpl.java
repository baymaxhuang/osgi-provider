package org.hhb.osgi.provider.impl;

import org.hhb.osgi.provider.api.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void hello(){
        System.out.println("Hello World !");
    }
}