package com.sermo.highlight_spring4.ch2.el.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sermo.highlight_spring4.ch2.el.ElConfig;

public class ElTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig resourceService = context.getBean(ElConfig.class);
		resourceService.outputResource();
		context.close();
	}
}
