package com.langsin.test1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			jb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("aaa");
				}
			});
		}
		
	}
}
