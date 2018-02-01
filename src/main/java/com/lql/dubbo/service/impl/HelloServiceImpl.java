package com.lql.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lql.dubbo.service.HelloService;

//使用dubbo的service注解
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "hello, " + name;
	}

}
