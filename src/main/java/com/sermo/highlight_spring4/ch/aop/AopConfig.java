package com.sermo.highlight_spring4.ch.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sermo.highlight_spring4.ch.aop")
@EnableAspectJAutoProxy //开启spring对AspectJ代理的支持
public class AopConfig {
	
}
