package com.langsin.test3;

import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class TestKeyEvent {
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(new Dimension(400,300));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}
}
