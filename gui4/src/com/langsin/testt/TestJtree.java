package com.langsin.testt;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.DefaultMutableTreeNode;

public class TestJtree {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�");
		DefaultMutableTreeNode shandong = new DefaultMutableTreeNode("ɽ��");
		DefaultMutableTreeNode jinan = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode zibo = new DefaultMutableTreeNode("�Ͳ�");
		DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("�㶫");
		DefaultMutableTreeNode guangzhou = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode shenzhen = new DefaultMutableTreeNode("����");
		
		
		shandong.add(jinan);
		shandong.add(zibo);
		
		guangdong.add(guangzhou);
		guangdong.add(shenzhen);
		
		root.add(shandong);
		root.add(guangdong);
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		JTree tree = new JTree(root);
		tree.setShowsRootHandles(true);
//		tree.setRootVisible(false);
//		tree.putClientProperty("JTree.lineStyle", "None");
		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setVisible(true);
		
		
	}
}
