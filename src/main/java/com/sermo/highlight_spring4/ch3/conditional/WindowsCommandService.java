package com.sermo.highlight_spring4.ch3.conditional;

public class WindowsCommandService implements ListService{

	@Override
	public String showListCmd() {
		return "dir";
	}

}
