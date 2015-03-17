package com.langsin.testt;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class ExtendsTreeRenderer {
	JFrame jf = new JFrame("���ݽڵ����Ͷ���ͼ��");

	JTree tree;
	DefaultMutableTreeNode root = new DefaultMutableTreeNode(new Node(
			DBType.ROOT, "���ݿ⵼��"));
	DefaultMutableTreeNode salaryDb = new DefaultMutableTreeNode(new Node(
			DBType.DATABASE, "��˾�������ݿ�"));
	DefaultMutableTreeNode customerDb = new DefaultMutableTreeNode(new Node(
			DBType.DATABASE, "��˾�ͻ����ݿ�"));
	// ����salaryDb�������ӽڵ�
	DefaultMutableTreeNode employee = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "Ա����"));
	DefaultMutableTreeNode attend = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "���ڱ�"));
	// ����customerDb��һ���ӽڵ�
	DefaultMutableTreeNode contact = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "��ϵ��ʽ��"));

	// ����employee�������ӽڵ�
	DefaultMutableTreeNode id = new DefaultMutableTreeNode(new Node(
			DBType.INDEX, "Ա��ID"));
	DefaultMutableTreeNode name = new DefaultMutableTreeNode(new Node(
			DBType.COLUMN, "����"));
	DefaultMutableTreeNode gender = new DefaultMutableTreeNode(new Node(
			DBType.COLUMN, "�Ա�"));

	public void init() throws Exception {
		root.add(salaryDb);
		root.add(customerDb);
		salaryDb.add(employee);
		salaryDb.add(attend);
		customerDb.add(contact);
		employee.add(id);
		employee.add(name);
		employee.add(gender);
		// �Ը��ڵ㴴����
		tree = new JTree(root);

		tree.setShowsRootHandles(true);
		tree.setRootVisible(true);
		tree.setCellRenderer(new MyRender());
		// ����ʹ��Windows������
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		// ����JTree��UI���
		SwingUtilities.updateComponentTreeUI(tree);
		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new ExtendsTreeRenderer().init();
	}

}

class MyRender extends DefaultTreeCellRenderer {
	// ��ʼ��5��ͼ��
	ImageIcon rootIcon = new ImageIcon("ico/root.gif");
	ImageIcon databaseIcon = new ImageIcon("ico/database.gif");
	ImageIcon tableIcon = new ImageIcon("ico/table.gif");
	ImageIcon columnIcon = new ImageIcon("ico/column.gif");
	ImageIcon indexIcon = new ImageIcon("ico/index.gif");

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		// TODO Auto-generated method stub
		// ִ�и���Ĭ�ϵĽڵ���Ʋ���
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
				row, hasFocus);
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
		Node data = (Node) node.getUserObject();
		// �������ݽڵ����nodeType���ݾ����ڵ�ͼ��
		ImageIcon icon = null;
		switch (data.nodeType) {
		case DBType.ROOT:
			icon = rootIcon;
			break;
		case DBType.DATABASE:
			icon = databaseIcon;
			break;
		case DBType.TABLE:
			icon = tableIcon;
			break;
		case DBType.COLUMN:
			icon = columnIcon;
			break;
		case DBType.INDEX:
			icon = indexIcon;
			break;
		}
		// �ı�ͼ��
		this.setIcon(icon);
		return this;
	}
}

class Node {
	public int nodeType;
	public String nodeData;

	public Node(int nodeType, String nodeData) {
		this.nodeType = nodeType;
		this.nodeData = nodeData;
	}

	public String toString() {
		return nodeData;
	}
}

interface DBType {
	int ROOT = 0;
	int DATABASE = 1;
	int TABLE = 2;
	int COLUMN = 3;
	int INDEX = 4;
}
