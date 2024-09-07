package com.bitcamp.GUIApp;

import java.awt.*;
import javax.swing.*;

public class SimpleGridLayout {
	private JPanel grid;
	SimpleGridLayout(JFrame frame) {
		grid = new JPanel();
		
		grid.setLayout(new GridLayout(3,2, 5, 5));
		
		grid.add(new JLabel("Nome:"));
		grid.add(new TextField(20));
		grid.add(new JLabel("Cognome:"));
		grid.add(new TextField(20));
		grid.add(new JButton("Invia"));
		
		frame.add(grid);
		frame.setSize(400, 300);
	}
}
