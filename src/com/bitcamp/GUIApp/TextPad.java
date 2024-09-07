package com.bitcamp.GUIApp;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class TextPad extends JFrame {

	private static final long serialVersionUID = 7610871209393498085L;

	public TextPad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("bitcamp Textpad");
		
		//Menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//fileMenu
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);

		
		JComponent[] fileMenuItems = {
				new JMenuItem("Nuova finestra"),
				new JMenuItem("Nuova scheda"),
				new JMenuItem("Apri"),
				new JMenuItem("Salva"),
				new JMenuItem("Salva con nome"),
				new JSeparator(),
				new JMenuItem("Imposta pagina"),
				new JMenuItem("Stampa"),
				new JSeparator(),
				new JMenuItem("Chiudi scheda"),
				new JMenuItem("Chiudi finestra"),
				new JMenuItem("Esci")
		};
		for(JComponent item : fileMenuItems)
			fileMenu.add(item);

		
		//editMenu
		JMenu editMenu = new JMenu("Modifica");
		menuBar.add(editMenu);
		
		JComponent[] editMenuItems = {
				new JMenuItem("Annulla"),
				new JSeparator(),
				new JMenuItem("Taglia"),
				new JMenuItem("Copia"),
				new JMenuItem("Elimina"),
				new JSeparator(),
				new JMenuItem("Cerca con Bing"),
				new JSeparator(),
				new JMenuItem("Trova"),
				new JMenuItem("Trova successivo"),
				new JMenuItem("Trova precedente"),
				new JMenuItem("Sostituisci"),
				new JMenuItem("Vai a"),
				new JSeparator(),
				new JMenuItem("Seleziona tutto"),
				new JMenuItem("Ora/Data"),
				new JMenuItem("Tipo di carattere")
		};
		for(JComponent item : editMenuItems)
			editMenu.add(item);
		
		JMenu showMenu = new JMenu("Visualizza");
		menuBar.add(showMenu);
		
		JComponent[] showMenuItems = {
				new JMenu("Zoom"),
				new JMenuItem("Barra di stato"),
				new JMenuItem("A capo automatico"),
		};
		showMenuItems[0].add(new JMenuItem("Zoom avanti"));
		showMenuItems[0].add(new JMenuItem("Zoom Indietro"));
		showMenuItems[0].add(new JMenuItem("Ripristina zoom predefinito"));
		
		for(JComponent item : showMenuItems)
			showMenu.add(item);
		
		//tabs
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		JTextArea textArea = new JTextArea(0, 80);
		JScrollPane scrollPane = new JScrollPane(textArea);
		tabbedPane.addTab("New tab", null, scrollPane, null);
		textArea.setLineWrap(true);
		textArea.setMargin( new Insets(1,2,1,2) );
		
		//bottom info
		JPanel bottomPanel = new JPanel();
		add(bottomPanel, BorderLayout.SOUTH);
		
		JPanel bottomLeftPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel bottomRightPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
		bottomPanel.add(bottomLeftPanel);
		bottomPanel.add(bottomRightPanel);
		
		JComponent[] bottomLeftItems = {
				new JLabel("Riga ?, Col. ?"),
				new JSeparator(SwingConstants.VERTICAL),
				new JLabel("? caratteri")
		};
		JComponent[] bottomRightItems = {
				new JLabel("100%"),
				new JSeparator(SwingConstants.VERTICAL),
				new JLabel("Windows (CLRF)"),
				new JSeparator(SwingConstants.VERTICAL),
				new JLabel("UTF-8")
		};
		
		for(JComponent item : bottomLeftItems) {
			if(item instanceof JSeparator)
				((JSeparator)item).setPreferredSize(new Dimension(2,15));

			bottomLeftPanel.add(item);
		}
		for(JComponent item : bottomRightItems) {
			if(item instanceof JSeparator)
				((JSeparator)item).setPreferredSize(new Dimension(2,15));

			bottomRightPanel.add(item);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				TextPad textpad = new TextPad();
				textpad.setSize(800, 800);
				textpad.setVisible(true);
			}
			
		});
	}
}
