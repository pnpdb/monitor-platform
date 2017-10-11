package com.ducetech.api.remote.impl;

import com.ducetech.api.remote.HelloService;


public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
