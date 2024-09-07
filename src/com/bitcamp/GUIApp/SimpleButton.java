package com.bitcamp.GUIApp;

import java.awt.event.*;

import javax.swing.*;

public class SimpleButton {
	JButton button;
	
	SimpleButton(SimpleWindow frame, String text) {
		button = new JButton(text);
		frame.getFrame().add(button);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame.getFrame(), "Button clicked");
			}
			
		});
		
	}
}
