package com.langsin.test3;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class TestJList {

	private JFrame jf ;
	private JList jl;
	private JComboBox jc ;
	public void init(){
		jf = new JFrame();
		jf.setSize(400,300);
		jf.setLayout(new FlowLayout());
		String[] teacher = {"云飞日月","风中叶","有风起浪"};
		jl = new JList(teacher);
		jc = new JComboBox(teacher);
		jf.add(jl);
		jf.add(jc);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		TestJList t = new TestJList();
		t.init();
	}
}
