package com.langsin.test3;

import javax.swing.*;

import java.awt.*;

public class TestJLayeredPane {
	JFrame jf = new JFrame("测试JLayeredPane");
	JLayeredPane layeredPane = new JLayeredPane();

	public void init() {
		JPanel jp1 = new MyPanel(10, 20, "面板1面板1面板1面板1");
		jp1.add(new JButton("OK"));
		JPanel jp2 = new MyPanel(100, 60, "面板2面板2面板2面板2");
		jp2.add(new JButton("OK"));
		JPanel jp3 = new MyPanel(190, 100, "面板3面板3面板3面板3");
		jp3.add(new JButton("OK"));
		JPanel jp4 = new MyPanel(280, 160, "面板4面板4面板4面板4");
		jp4.add(new JButton("OK"));

		// 向layeredPane中添加4个组件
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
