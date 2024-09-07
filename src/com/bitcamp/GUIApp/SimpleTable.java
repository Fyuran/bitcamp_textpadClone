package com.bitcamp.GUIApp;

import javax.swing.*;
import javax.swing.table.*;

public class SimpleTable {
	JTable table;
	
	SimpleTable(JFrame frame) {
		Object[][] data = {
				{"Mario", "Rossi", 30},
				{"Luca", "Gialli", 24},
				{"Giovanna", "Neri", 18}
		};
		
		String[] columnNames = {"Nome", "Cognome", "Età"};
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		
		table = new JTable(model);
		
		JScrollPane scroll = new JScrollPane(table);
		
		frame.setSize(600, 400);
		frame.add(scroll);
	}
}
