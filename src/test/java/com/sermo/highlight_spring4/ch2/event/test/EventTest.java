package com.sermo.highlight_spring4.ch2.event.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sermo.highlight_spring4.ch2.event.DemoPuhlisher;
import com.sermo.highlight_spring4.ch2.event.EventConfig;

public class EventTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPuhlisher puhlisher = context.getBean(DemoPuhlisher.class);
		puhlisher.publish("hello application event");
		context.close();
	}
}
