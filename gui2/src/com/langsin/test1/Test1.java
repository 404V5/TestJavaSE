package com.langsin.test1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {

	public static void main(String[] args) {
		JFrame jf =  new JFrame();
		jf.setBounds(100, 100, 400, 300);
		//���ò��ֹ�����
		BorderLayout layout = new BorderLayout();
		jf.setLayout(layout);
		
		
		
		
		JButton btn1 = new JButton("��");
		JButton btn11 = new JButton("��2");
		JButton btn2 = new JButton("��");
		JButton btn3 = new JButton("��");
		JButton btn4 = new JButton("��");
		JButton btn5 = new JButton("��");
		
		
		
		JPanel jp1 = new JPanel();
		jp1.add(btn1);
		jp1.add(btn11);
		
		
		
		jf.add(jp1,BorderLayout.EAST);
		jf.add(btn2,BorderLayout.WEST);
		jf.add(btn3,BorderLayout.SOUTH);
		jf.add(btn4,BorderLayout.NORTH);
		jf.add(btn5,BorderLayout.CENTER);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
