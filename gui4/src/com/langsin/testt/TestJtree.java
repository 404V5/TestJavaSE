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
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("中国");
		DefaultMutableTreeNode shandong = new DefaultMutableTreeNode("山东");
		DefaultMutableTreeNode jinan = new DefaultMutableTreeNode("济南");
		DefaultMutableTreeNode zibo = new DefaultMutableTreeNode("淄博");
		DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("广东");
		DefaultMutableTreeNode guangzhou = new DefaultMutableTreeNode("广州");
		DefaultMutableTreeNode shenzhen = new DefaultMutableTreeNode("深圳");
		
		
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
