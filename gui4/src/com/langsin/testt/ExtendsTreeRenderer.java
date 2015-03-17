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
	JFrame jf = new JFrame("根据节点类型定义图标");

	JTree tree;
	DefaultMutableTreeNode root = new DefaultMutableTreeNode(new Node(
			DBType.ROOT, "数据库导航"));
	DefaultMutableTreeNode salaryDb = new DefaultMutableTreeNode(new Node(
			DBType.DATABASE, "公司工资数据库"));
	DefaultMutableTreeNode customerDb = new DefaultMutableTreeNode(new Node(
			DBType.DATABASE, "公司客户数据库"));
	// 定义salaryDb的两个子节点
	DefaultMutableTreeNode employee = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "员工表"));
	DefaultMutableTreeNode attend = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "考勤表"));
	// 定义customerDb的一个子节点
	DefaultMutableTreeNode contact = new DefaultMutableTreeNode(new Node(
			DBType.TABLE, "联系方式表"));

	// 定义employee的三个子节点
	DefaultMutableTreeNode id = new DefaultMutableTreeNode(new Node(
			DBType.INDEX, "员工ID"));
	DefaultMutableTreeNode name = new DefaultMutableTreeNode(new Node(
			DBType.COLUMN, "姓名"));
	DefaultMutableTreeNode gender = new DefaultMutableTreeNode(new Node(
			DBType.COLUMN, "性别"));

	public void init() throws Exception {
		root.add(salaryDb);
		root.add(customerDb);
		salaryDb.add(employee);
		salaryDb.add(attend);
		customerDb.add(contact);
		employee.add(id);
		employee.add(name);
		employee.add(gender);
		// 以根节点创建树
		tree = new JTree(root);

		tree.setShowsRootHandles(true);
		tree.setRootVisible(true);
		tree.setCellRenderer(new MyRender());
		// 设置使用Windows风格外观
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		// 更新JTree的UI外观
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
	// 初始化5个图标
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
		// 执行父类默认的节点绘制操作
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
				row, hasFocus);
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
		Node data = (Node) node.getUserObject();
		// 根据数据节点里的nodeType数据决定节点图标
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
		// 改变图标
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
