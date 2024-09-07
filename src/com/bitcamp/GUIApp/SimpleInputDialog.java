package com.bitcamp.GUIApp;

import javax.swing.*;

public class SimpleInputDialog {
	SimpleInputDialog(JFrame frame) {
		String name = JOptionPane.showInputDialog(frame, "Inserisci nome");
		
		JOptionPane.showMessageDialog(frame, "Bevenuto " + name);
	}
}
