package com.techlabs.observer.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel headerLabel;
	JLabel statusLabel;

	public MainFrame() {
		this.setSize(400, 400);
		this.setLayout(new GridLayout(1, 1));
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		this.add(controlPanel);
		this.setVisible(true);

		JButton okButton = new JButton("Source");
		okButton.addActionListener(new HelloListener());
		okButton.addActionListener(new ExitListener());
		controlPanel.add(okButton);
		this.setVisible(true);
	}
}
