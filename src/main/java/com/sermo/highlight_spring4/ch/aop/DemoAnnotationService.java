package com.sermo.highlight_spring4.ch.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的 add 方法")
	public void add(){
		
	}
}
