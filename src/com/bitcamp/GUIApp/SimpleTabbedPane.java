package com.bitcamp.GUIApp;

import java.util.stream.Stream;

import javax.swing.*;

public class SimpleTabbedPane {
	private JTabbedPane tabbedPane;
	
	SimpleTabbedPane(JFrame frame) {
		tabbedPane = new JTabbedPane();
		
		JPanel[] panels = Stream.generate(JPanel::new).limit(4).toArray(JPanel[]::new);
		
		
		panels[0].add(new JLabel("Tab 1 Content"));
		panels[1].add(new JLabel("Tab 2 Content"));
		panels[2].add(new JLabel("Tab 3 Content"));
		panels[3].add(new JLabel("Tab 4 Content"));
		
		for(int i = 0; i < panels.length; i++)
			tabbedPane.addTab("Tab" + (i + 1), panels[i]);
		
		frame.add(tabbedPane);
		
		frame.setSize(400, 300);
	}
}
