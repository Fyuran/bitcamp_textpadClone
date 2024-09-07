package com.bitcamp.GUIApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleInput {
	private JTextField field;
	
	SimpleInput(SimpleWindow frame, int maxColumns) {
		JLabel label = new JLabel("Insert text");
		
		field = new JTextField(maxColumns);
		
		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Text written: " + field.getText());
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(field);
		frame.getFrame().add(panel);
	}
}
