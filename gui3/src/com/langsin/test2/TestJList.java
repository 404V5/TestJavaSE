package com.langsin.test2;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TestJList {

	private JFrame jf;
	private JList jl;
	private JComboBox jc;

	public void init() {
		jf = new JFrame();
		jf.setSize(400, 300);
		jf.setLayout(new FlowLayout());
		String[] teacher = { "云飞日月", "风中叶", "有风起浪", "骑车上树", "永不言败" };
		jl = new JList(teacher);
		jl.setVisibleRowCount(3);
		jl.setSelectionInterval(2, 4);
		//添加选择事件
		jl.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				Object[] teachers = jl.getSelectedValues();
				for (Object o : teachers) {
					System.out.println(o);
				}
			}
		});

		jc = new JComboBox(teacher);
		jc.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("..");
				// TODO Auto-generated method stub
				Object teacher = jc.getSelectedItem();
				System.out.println(teacher);
			}
		});
		
		jc.setEditable(true);
		jc.setMaximumRowCount(3);

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
