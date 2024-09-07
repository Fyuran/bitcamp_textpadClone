package com.bitcamp.GUIApp;

import javax.swing.*;

public class SimpleMenu {
	private JMenuBar menuBar;
	
	SimpleMenu(JFrame frame) {
		menuBar = new JMenuBar();
		
		JMenu[] subMenu = {new JMenu("File"), new JMenu("Edit")};
		JMenuItem[] fileMenuItems = {new JMenuItem("New"), new JMenuItem("Open"), new JMenuItem("Exit")};
		JMenuItem[] editMenuItems = {new JMenuItem("Copy"), new JMenuItem("Cut")};
		
		for(JMenuItem item : fileMenuItems)
			subMenu[0].add(item);
		
		for(JMenuItem item : editMenuItems)
			subMenu[1].add(item);
		
		for(JMenu menu : subMenu)
			menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
	}
}
