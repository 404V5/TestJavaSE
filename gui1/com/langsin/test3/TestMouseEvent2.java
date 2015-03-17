package com.langsin.test3;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestMouseEvent2 {
	public static void main(String[] args) {
		TestMouseEvent2 t2 = new TestMouseEvent2();
		t2.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 300);
		jf.setLayout(new FlowLayout());

		JButton jb = new JButton("点击我");
//		jb.addMouseListener(new MouseAdapter(){
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int count = e.getClickCount();
//				if(count == 2){
//					System.out.println("完成了双机");
//				}
////				System.out.println(e.getX());
////				System.out.println(e.getY());
////				System.out.println(e.getXOnScreen());
////				System.out.println(e.getYOnScreen());
//				
//				
////				int b = e.getButton();
////				if(b == 1){
////					System.out.println("按下左键");
////				}else if(b == 2){
////					System.out.println("按下中键");
////				}else if(b == 3){
////					System.out.println("按下右键");
////				}else{
////					System.out.println("不能识别的键");
////				}
//			}
//		});
		//jb.addMouseListener(new MyMouseListener());
		//jb.addMouseMotionListener(new MyMouseMotionListener());
		jb.addMouseWheelListener(new MyMouseWheelListener());
		jf.add(jb);
	}
	
	
	
	
	
	class MyMouseMotionListener implements MouseMotionListener{

		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标拖动");
		}

		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标移动");
		}
		
	}
	class MyMouseWheelListener implements MouseWheelListener{
		public void mouseWheelMoved(MouseWheelEvent e) {
			int type = e.getScrollType();
			System.out.println(e.getWheelRotation());
		}
	}
	class MyMouseListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标点击");
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标进入");
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标离开");
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标按下");
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("鼠标抬起");
		}
		
		
		
	}
	
	
	
}
