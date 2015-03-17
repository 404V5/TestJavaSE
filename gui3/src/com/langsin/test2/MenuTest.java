package com.langsin.test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest {

	public static void main(String[] args) {
		JFrame jf = new JFrame("测试菜单");
		jf.setSize(600,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenu file = new JMenu("文件");
		JMenu edit = new JMenu("编辑");
		
		JMenu new1 = new JMenu("新建");
		
		JMenuItem class1 = new JMenuItem("类");
		JMenuItem file1 = new JMenuItem("文件");
		new1.add(class1);
		new1.add(file1);
		
		JMenuItem close = new JMenuItem("关闭");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		JMenuItem copy = new JMenuItem("复制");
		JMenuItem paste = new JMenuItem("粘贴");
		
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
