package com.sermo.highlight_spring4.ch3.conditional;


public class LinuxCommandService implements ListService{

	@Override
	public String showListCmd() {
		return "ls";
	}
}
