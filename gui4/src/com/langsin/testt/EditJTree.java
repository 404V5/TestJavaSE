package com.langsin.testt;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
import java.awt.*;

public class EditJTree {
	JFrame jf;
	JTree tree;
	// 上面JTree对象对应的model
	DefaultTreeModel model;

	// 定义几个初始节点
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("中国");
	DefaultMutableTreeNode shandong = new DefaultMutableTreeNode("山东");
	DefaultMutableTreeNode jiangsu = new DefaultMutableTreeNode("江苏");
	DefaultMutableTreeNode jinan = new DefaultMutableTreeNode("济南");
	DefaultMutableTreeNode qingdao = new DefaultMutableTreeNode("青岛");
	DefaultMutableTreeNode nanjing = new DefaultMutableTreeNode("南京");
	DefaultMutableTreeNode suzhou = new DefaultMutableTreeNode("苏州");

	// 定义需要被拖动的TreePath
	TreePath movePath;

	JButton addSiblingButton = new JButton("添加兄弟节点");
	JButton addChildButton = new JButton("添加子节点");
	JButton deleteButton = new JButton("删除节点");
	JButton editButton = new JButton("编辑当前节点");

	public void init() {
		shandong.add(jinan);
		shandong.add(qingdao);
		jiangsu.add(nanjing);
		jiangsu.add(suzhou);
		root.add(shandong);
		root.add(jiangsu);

		jf = new JFrame("树");
		tree = new JTree(root);
		// 获取JTree对应的TreeModel对象
		model = (DefaultTreeModel) tree.getModel();
		// 设置JTree可编辑
		tree.setEditable(true);
		MouseListener ml = new MouseAdapter() {
			// 按下鼠标时候获得被拖动的节点
			public void mousePressed(MouseEvent e) {
				// 如果需要唯一确定某个节点，必须通过TreePath来获取。
				TreePath tp = tree.getPathForLocation(e.getX(), e.getY());
				if (tp != null) {
					movePath = tp;
				}
			}

			// 鼠标松开时获得需要拖到哪个父节点
			public void mouseReleased(MouseEvent e) {
				// 根据鼠标松开时的TreePath来获取TreePath
				TreePath tp = tree.getPathForLocation(e.getX(), e.getY());

				if (tp != null && movePath != null) {
					// 阻止向子节点拖动
					if (movePath.isDescendant(tp) && movePath != tp) {
						JOptionPane.showMessageDialog(jf,
								"目标节点是被移动节点的子节点，无法移动！", "非法操作",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					// 既不是向子节点移动，而且鼠标按下、松开的不是同一个节点
					else if (movePath != tp) {
						System.out.println(tp.getLastPathComponent());
						// add方法可以先将原节点从原父节点删除，再添加到新父节点中
						((DefaultMutableTreeNode) tp.getLastPathComponent())
								.add((DefaultMutableTreeNode) movePath
										.getLastPathComponent());
						movePath = null;
						tree.updateUI();
					}
				}
			}
		};
		tree.addMouseListener(ml);

		JPanel panel = new JPanel();

		addSiblingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 获取选中节点
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
						.getLastSelectedPathComponent();
				// 如果节点为空，直接返回
				if (selectedNode == null)
					return;
				// 获取该选中节点的父节点
				DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selectedNode
						.getParent();
				// 如果父节点为空，直接返回
				if (parent == null)
					return;
				// 创建一个新节点
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(
						"新节点");
				// 获取选中节点的选中索引
				int selectedIndex = parent.getIndex(selectedNode);
				// 在选中位置插入新节点
				model.insertNodeInto(newNode, parent, selectedIndex + 1);
				// --------下面代码实现显示新节点（自动展开父节点）-------
				// 获取从根节点到新节点的所有节点
				TreeNode[] nodes = model.getPathToRoot(newNode);
				// 使用指定的节点数组来创建TreePath
				TreePath path = new TreePath(nodes);
				// 显示指定TreePath
				tree.scrollPathToVisible(path);
			}
		});
		panel.add(addSiblingButton);

		addChildButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 获取选中节点
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
						.getLastSelectedPathComponent();
				// 如果节点为空，直接返回
				if (selectedNode == null)
					return;
				// 创建一个新节点
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(
						"新节点");
				// 直接通过model来添加新节点，则无需通过调用JTree的updateUI方法
				// model.insertNodeInto(newNode, selectedNode,
				// selectedNode.getChildCount());
				// 直接通过节点添加新节点，则需要调用tree的updateUI方法
				selectedNode.add(newNode);
				// --------下面代码实现显示新节点（自动展开父节点）-------
				TreeNode[] nodes = model.getPathToRoot(newNode);
				TreePath path = new TreePath(nodes);
				tree.scrollPathToVisible(path);
				tree.updateUI();
			}
		});
		panel.add(addChildButton);

		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree
						.getLastSelectedPathComponent();
				if (selectedNode != null && selectedNode.getParent() != null) {
					// 删除指定节点
					model.removeNodeFromParent(selectedNode);
				}
			}
		});
		panel.add(deleteButton);

		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TreePath selectedPath = tree.getSelectionPath();
				if (selectedPath != null) {
					// 编辑选中节点
					tree.startEditingAtPath(selectedPath);
				}
			}
		});
		panel.add(editButton);

		jf.add(new JScrollPane(tree));
		jf.add(panel, BorderLayout.SOUTH);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new EditJTree().init();
	}
} 
