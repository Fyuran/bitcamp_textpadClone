package com.bitcamp.GUIApp;

import java.awt.*;
import javax.swing.*;

public class ManagementExample extends JFrame {
	private static final long serialVersionUID = 933455754919452285L;

	ManagementExample() {
		setTitle("Esempio App Gestionale");
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screen.width/2, screen.height/2);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		//Menus
		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(200, 800));
		menuPanel.setBackground(Color.LIGHT_GRAY);
		
		JButton customersBtn = new JButton("Clienti");
		JButton productsBtn = new JButton("Prodotti");
		JButton suppliersBtn = new JButton("Fornitori");
		JButton soldBtm = new JButton("Vendite");
		
		menuPanel.add(productsBtn);
		menuPanel.add(soldBtm);
		menuPanel.add(customersBtn);
		menuPanel.add(suppliersBtn);
		
		//Content
		JPanel contentPanel = new JPanel(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		
		JLabel titleLabel = new JLabel("Benvenuto nel gestionale");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		contentPanel.add(titleLabel, BorderLayout.NORTH);
		
		JTextArea placeholderArea = new JTextArea(20, 80);
		placeholderArea.setEditable(false);
		placeholderArea.setText("Esempio di gestionale qui");
		
		contentPanel.add(placeholderArea, BorderLayout.CENTER);
		
		//Graphs
		JPanel chartPanel = new JPanel();
		chartPanel.setPreferredSize(new Dimension(400, 400));
		chartPanel.setBackground(Color.YELLOW);
		JLabel chartLabel = new JLabel("Grafici");
		chartPanel.add(chartLabel);
		
		contentPanel.add(chartPanel, BorderLayout.SOUTH);
		
		//add panels to mainPanel
		mainPanel.add(menuPanel, BorderLayout.WEST);
		mainPanel.add(contentPanel, BorderLayout.CENTER);
		
		add(mainPanel);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new ManagementExample().setVisible(true);		
			}
			
		});
	}
}
