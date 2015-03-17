package com.langsin.test3;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class TestSplitPane {
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JTextArea jta = new JTextArea(20, 90);
	private void init(){
		JFrame jf = new JFrame("≤‚ ‘JSplitPane");
		
		jp1.setPreferredSize(new Dimension(150, 300));
		jp2.setPreferredSize(new Dimension(300, 150));
		jp3.setPreferredSize(new Dimension(300, 150));
		
		
		
		JSplitPane jsp1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, false, jp1, jp2);
		
		jsp1.setOneTouchExpandable(true);
		
		

		
		
		JSplitPane jsp2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,jsp1,jp3);
		
		
		jf.add(jsp2);
		
//		jp1.add(new JButton("jp1"));
//		jp2.add(new JButton("jp2"));
//		jp3.add(new JButton("jp3"));
//		
		
	
		
		
		
		
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);

	}
	public static void main(String[] args) {
		new TestSplitPane().init();
	}

}
