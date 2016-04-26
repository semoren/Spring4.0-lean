package com.sermo.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsConditional.class)
	public ListService commandService(){
		return new WindowsCommandService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxEmailerService(){
		return new LinuxCommandService();
	}
}
