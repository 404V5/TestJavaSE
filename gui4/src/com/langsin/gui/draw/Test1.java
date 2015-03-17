package com.langsin.gui.draw;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(600,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final MyCanvas mc = new MyCanvas();
		jf.add(mc);
		JButton jb = new JButton("随机画一个矩形");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mc.repaint();
			}
		});
		jf.add(jb,BorderLayout.SOUTH);
	}
	/**
	 * 充当画板
	 * 重写paint方法
	 * @author Administrator
	 *
	 */
	class MyCanvas extends JPanel{
		/**
		 * 这个方法我们不要人工调用
		 * 要想通知绘图，使用repaint方法
		 * 形式参数g就是我们的画笔
		 * 
		 */
		Random r = new Random();
		
		@Override
		public void paint(Graphics g) {
			
			g.setColor(Color.white);
			g.fillRect(0, 0, 600, 400);
			g.setColor(Color.RED);
			g.fillRect(r.nextInt(600), r.nextInt(400), 50, 50);
		}
	}
}





















