package com.langsin.test2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame
	 */
	public MainFrame() {
		super();
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel label = new JLabel();
		label.setText("»¶Ó­À´µ½Ö÷Ò³");
		getContentPane().add(label, BorderLayout.CENTER);
		//
	}

}
