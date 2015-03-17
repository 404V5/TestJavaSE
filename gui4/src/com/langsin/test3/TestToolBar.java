package com.langsin.test3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestToolBar {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(600	, 400);
		
		Action action = new AbstractAction("��ť") {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("����¼�");
			}
			
			
		};
		
		JButton jb = new JButton(action);
		
		
		jf.setLayout(new FlowLayout());
		jf.add(jb);
		
		
		
		JMenu file = new JMenu("�ļ�");
		JMenuItem ok = new JMenuItem(action);
		
		file.add(ok);
		JMenuBar jmb = new JMenuBar();
		jmb.add(file);
		jf.setJMenuBar(jmb);
		
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
