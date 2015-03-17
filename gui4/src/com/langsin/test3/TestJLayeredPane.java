package com.langsin.test3;

import javax.swing.*;

import java.awt.*;

public class TestJLayeredPane {
	JFrame jf = new JFrame("����JLayeredPane");
	JLayeredPane layeredPane = new JLayeredPane();

	public void init() {
		JPanel jp1 = new MyPanel(10, 20, "���1���1���1���1");
		jp1.add(new JButton("OK"));
		JPanel jp2 = new MyPanel(100, 60, "���2���2���2���2");
		jp2.add(new JButton("OK"));
		JPanel jp3 = new MyPanel(190, 100, "���3���3���3���3");
		jp3.add(new JButton("OK"));
		JPanel jp4 = new MyPanel(280, 160, "���4���4���4���4");
		jp4.add(new JButton("OK"));

		// ��layeredPane�����4�����
		layeredPane.add(jp1, JLayeredPane.MODAL_LAYER);
		layeredPane.add(jp2, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(jp3, 4);
		layeredPane.add(jp4, 5);
		layeredPane.setPreferredSize(new Dimension(400, 300));
		layeredPane.setVisible(true);
		jf.add(layeredPane);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new TestJLayeredPane().init();
	}
}

class MyPanel extends JPanel {
	public MyPanel(int x, int y, String title) {
		setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), title));
		setBounds(x, y, 170, 210);
	}
}
