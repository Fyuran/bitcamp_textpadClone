package com.bitcamp.GUIApp;

import javax.swing.*;

public class SimpleList {
	private JList<String> list;
	
	SimpleList(JFrame frame) {
		String[] data = new String[10];
		for(int i = 0; i < data.length; i++)
			data[i] = "elem " + (i + 1);
		
		list = new JList<>(data);
		JScrollPane scroll = new JScrollPane(list);
		
		frame.add(scroll);
	}
}
