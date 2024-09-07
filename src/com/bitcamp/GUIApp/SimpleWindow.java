package com.bitcamp.GUIApp;

import javax.swing.*;

public class SimpleWindow {
	
	private JFrame frame;
	
	SimpleWindow(String text) {
		frame = new JFrame(text);
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void setVisible(boolean show) {
		frame.setVisible(show);
	}
}
