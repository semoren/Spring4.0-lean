package com.sermo.highlight_spring4.ch2.prepost.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sermo.highlight_spring4.ch2.prepost.BeanWayService;
import com.sermo.highlight_spring4.ch2.prepost.JSR250WayService;
import com.sermo.highlight_spring4.ch2.prepost.PrePostConfig;

public class PrepostTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}
}
