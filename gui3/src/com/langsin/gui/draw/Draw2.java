package com.langsin.gui.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw2 {

	public static void main(String[] args) {
		final JFrame jf = new JFrame();
		jf.setSize(800, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel(){
			public void paint(java.awt.Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.translate(200, 200);
				g2.rotate(Math.toRadians(45));
				g2.setColor(Color.black);
				g2.fillRect(0, 0, 100, 100);
				g2.rotate(-Math.toRadians(45));
				g2.translate(-200, -200);
				
				
				g2.setColor(Color.red);
				g2.fillRect(0, 0, 100, 100);
				
				
//				g2.translate(50, 50);
//				g2.setColor(Color.black);
//				g2.fillRect(0, 0, 100, 100);
//				g2.translate(-50, -50);
//				g2.setColor(Color.red);
//				g2.fillRect(0, 0, 50, 50);
				
//				g2.setColor(Color.black);
//				g2.fillRect(50, 50, 100, 100);
//				g2.setColor(Color.red);
//				g2.fillRect(100, 100, 100, 100);
				
			};
		};
		
		jf.setContentPane(pane);
		jf.setVisible(true);
	}
}
