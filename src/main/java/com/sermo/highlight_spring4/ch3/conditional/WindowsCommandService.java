package com.sermo.highlight_spring4.ch3.conditional;

public class WindowsCommandService implements CommandService{

	@Override
	public String showListCommand() {
		return "dir";
	}

}
