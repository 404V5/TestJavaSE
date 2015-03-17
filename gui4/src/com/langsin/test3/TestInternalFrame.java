package com.langsin.test3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestInternalFrame {
	final int DESKTOP_WIDTH = 480;
	final int DESKTOP_HEIGHT = 360;
	final int FRAME_DISTANCE = 30;

	JFrame jf = new JFrame("父窗口");
	// 定义一个虚拟桌面
	private JDesktopPane desktop = new JDesktopPane();
	// 保存下一个内部窗口的座标点
	private int nextFrameX;
	private int nextFrameY;
	// 定义内部窗口为虚拟桌面的1/2大小
	private int width = DESKTOP_WIDTH / 2;
	private int height = DESKTOP_HEIGHT / 2;
	// 为主窗口定义2个菜单
	JMenu fileMenu = new JMenu("文件");
	// 定义newAction用于创建菜单和工具按钮
	Action newAction = new AbstractAction("新建", new ImageIcon("ico/new.png")) {
		public void actionPerformed(ActionEvent event) {
			// 创建内部窗口
			final JInternalFrame iframe = new JInternalFrame("新文档",
					true, // 可改变大小
					true, // 可关闭
					true, // 可最大化
					true); // 可最小化
			iframe.add(new JScrollPane(new JTextArea(8, 40)));
			// 将内部窗口添加到虚拟桌面中
			desktop.add(iframe);
			// 设置内部窗口的原始位置（内部窗口默认大小是0X0，放在0,0位置）
			iframe.reshape(nextFrameX, nextFrameY, width, height);
			// 使该窗口可见，并尝试选中它
			iframe.show();
			// 计算下一个内部窗口的位置
			nextFrameX += FRAME_DISTANCE;
			nextFrameY += FRAME_DISTANCE;
			if (nextFrameX + width > desktop.getWidth())
				nextFrameX = 0;
			if (nextFrameY + height > desktop.getHeight())
				nextFrameY = 0;
		}
	};
	// 定义exitAction用于创建菜单和工具按钮
	Action exitAction = new AbstractAction("退出", new ImageIcon("ico/exit.png")) {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	};

	public void init() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		// 为窗口安装菜单条和工具条
		JMenuBar menuBar = new JMenuBar();
		JToolBar toolBar = new JToolBar();
		jf.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		fileMenu.add(newAction);
		fileMenu.add(exitAction);
		toolBar.add(newAction);
		toolBar.add(exitAction);
		desktop.setPreferredSize(new Dimension(480, 360));
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		// 将虚拟桌面添加到顶级JFrame容器中
		jf.add(desktop);
		jf.add(toolBar, BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		new TestInternalFrame().init();
	}
}
