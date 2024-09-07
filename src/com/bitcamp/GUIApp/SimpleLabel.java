package com.bitcamp.GUIApp;

import javax.swing.JLabel;

public class SimpleLabel {
	private JLabel label;
	
	SimpleLabel(SimpleWindow frame, String text) {
		this.label = new JLabel(text);
		frame.getFrame().add(label);
	}
	
	public JLabel getLabel() {
		return label;
	}
}
