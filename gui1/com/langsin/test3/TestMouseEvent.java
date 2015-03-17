package com.langsin.test3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestMouseEvent {
	public static void main(String[] args) {
		TestMouseEvent t = new TestMouseEvent();
		t.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 300);
		jf.setLayout(new FlowLayout());

		JButton jb = new JButton("�����");
		//jb.addMouseListener(new MyMouseListener());
		//jb.addMouseMotionListener(new MyMouseMotionListener());
		//jb.addMouseWheelListener(new MyMouseWheelListener());
		jf.add(jb);
	}
	
	class MyMouseMotionListener implements MouseMotionListener{

		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����϶�");
		}

		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����ƶ�");
		}
		
	}
	class MyMouseWheelListener implements MouseWheelListener{
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			System.out.println("�����ֹ���");
		}
	}
	class MyMouseListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("�����");
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("������");
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("����뿪");
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("��갴��");
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("���̧��");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
