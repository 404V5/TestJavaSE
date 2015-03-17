package com.langsin.test1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {

	public static void main(String[] args) {
		long l = 1817623871263871628L;
		JFrame jf = new JFrame("≤‚ ‘");
		jf.setSize(600, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		for (int i = 0; i < 10; i++) {
			JButton jb = new JButton("∞¥≈•"+i);
			jf.add(jb);
		}
		
	}
}
