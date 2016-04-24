package com.sermo.highlight_spring4.ch2.profile.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sermo.highlight_spring4.ch2.profile.DemoBean;
import com.sermo.highlight_spring4.ch2.profile.ProfileConfig;

public class ProfileTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}
}
