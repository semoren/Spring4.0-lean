package com.sermo.highlight_spring4.ch3.conditional;


public class LinuxCommandService implements CommandService{

	@Override
	public String showListCommand() {
		return "ls";
	}

}
