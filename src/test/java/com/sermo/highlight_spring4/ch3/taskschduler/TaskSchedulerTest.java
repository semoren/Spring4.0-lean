package com.sermo.highlight_spring4.ch3.taskschduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sermo.highlight_spring4.ch3.taskscheduler.TaskschedulerConfig;

public class TaskSchedulerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskschedulerConfig.class);
		context.close();
	}
}
