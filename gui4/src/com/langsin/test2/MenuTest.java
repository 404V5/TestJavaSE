package com.langsin.test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest {

	public static void main(String[] args) {
		JFrame jf = new JFrame("���Բ˵�");
		jf.setSize(600,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenu file = new JMenu("�ļ�");
		JMenu edit = new JMenu("�༭");
		
		JMenu new1 = new JMenu("�½�");
		
		JMenuItem class1 = new JMenuItem("��");
		JMenuItem file1 = new JMenuItem("�ļ�");
		new1.add(class1);
		new1.add(file1);
		
		JMenuItem close = new JMenuItem("�ر�");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		JMenuItem copy = new JMenuItem("����");
		JMenuItem paste = new JMenuItem("ճ��");
		
		file.add(new1);
		file.addSeparator();
		file.add(close);
		
		
		edit.add(copy);
		edit.add(paste);
		
		JMenuBar jmb = new JMenuBar();
		jmb.add(file);
		jmb.add(edit);
		
		
		jf.setJMenuBar(jmb);
		
		
		
		
		
	}
}
