package com.sermo.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sermo.highlight_spring4.ch3.conditional")
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsConditional.class)
	public CommandService commandService(){
		return new WindowsCommandService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public CommandService linuxEmailerService(){
		return new LinuxCommandService();
	}
}
