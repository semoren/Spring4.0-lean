package com.sermo.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		CommandService service = context.getBean(CommandService.class);
		System.out.println(service.showListCommand());
		context.close();
	}
}
