package com.langsin.testt;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class ChangeAllCellRender {
	JFrame jf = new JFrame("�ı����нڵ�����");

	JTree tree;
	// ���弸����ʼ�ڵ�
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�");
	DefaultMutableTreeNode shandong = new DefaultMutableTreeNode("ɽ��");
	DefaultMutableTreeNode jiangsu = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode jinan = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode qingdao = new DefaultMutableTreeNode("�ൺ");
	DefaultMutableTreeNode nanjing = new DefaultMutableTreeNode("�Ͼ�");
	DefaultMutableTreeNode suzhou = new DefaultMutableTreeNode("����");

	public void init() throws Exception {
		// ͨ��add�����������ڵ�֮��ĸ��ӹ�ϵ
		shandong.add(jinan);
		shandong.add(qingdao);
		jiangsu.add(nanjing);
		jiangsu.add(suzhou);
		root.add(shandong);
		root.add(jiangsu);
		// �Ը��ڵ㴴����
		tree = new JTree(root);

		// ����һ��DefaultTreeCellRender����
		DefaultTreeCellRenderer cellRender = new DefaultTreeCellRenderer();
		// ���÷�ѡ���ڵ�ı���ɫ��
		cellRender.setBackgroundNonSelectionColor(new Color(255,255,0));
		// ���ýڵ���ѡ��״̬�µı�����ɫ��
		cellRender.setBackgroundSelectionColor(new Color(0, 0, 255));
		// ����ѡ��״̬�½ڵ�ı߿���ɫ��
		cellRender.setBorderSelectionColor(Color.BLACK);
		// ���ô����۵�״̬�·�Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setClosedIcon(new ImageIcon("ico/close.gif"));
		// ���ýڵ��ı������塣
		cellRender.setFont(new Font("SansSerif", Font.BOLD, 12));
		// ����Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setLeafIcon(new ImageIcon("ico/leaf.png"));
		// ���ô���չ��״̬�·�Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setOpenIcon(new ImageIcon("ico/open.gif"));
		// ���û��Ʒ�ѡ��״̬�½ڵ��ı�����ɫ��
		cellRender.setTextNonSelectionColor(new Color(255, 0, 0));
		// ���û���ѡ��״̬�½ڵ��ı�����ɫ��
		cellRender.setTextSelectionColor(new Color(0, 255, 0));

		tree.setCellRenderer(cellRender);

		// �����Ƿ���ʾ���ڵ�ġ�չ��/�۵���ͼ��,Ĭ����false
		tree.setShowsRootHandles(true);
		// ���ýڵ��Ƿ�ɼ�,Ĭ����true
		tree.setRootVisible(true);

		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new ChangeAllCellRender().init();
	}
}
