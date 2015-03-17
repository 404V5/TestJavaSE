package com.langsin.gui.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HandDraw {
	//��һ�ε�x����
	private int preX = -1;	
	private int preY = -1;	
	//�������ͼ
	private BufferedImage image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
	//����
	Graphics g = image.getGraphics();
	//����
	MyPane pane = new MyPane();
	private void go() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(800,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 800, 600);
		pane.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				// ���preX��preY����0
				if (preX > 0 && preY > 0) {
					// ���õ�ǰ��ɫ
					g.setColor(Color.RED);
					// ���ƴ���һ������϶��¼��㵽��������϶��¼�����߶�
					g.drawLine(preX, preY, e.getX(), e.getY());
				}
				// ����ǰ����¼����X��Y���걣������
				preX = e.getX();
				preY = e.getY();
				pane.repaint();
			};
		});
		pane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				preX = -1;
				preY = -1;
			}
		});
		
		jf.add(pane);
		
	}
	

	public static void main(String[] args) {
		HandDraw hd = new HandDraw();
		hd.go();
	}

	class MyPane extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.drawImage(image,0,0,null);
		}
	}

}
