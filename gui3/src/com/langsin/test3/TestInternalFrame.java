package com.langsin.test3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestInternalFrame {
	final int DESKTOP_WIDTH = 480;
	final int DESKTOP_HEIGHT = 360;
	final int FRAME_DISTANCE = 30;

	JFrame jf = new JFrame("������");
	// ����һ����������
	private JDesktopPane desktop = new JDesktopPane();
	// ������һ���ڲ����ڵ������
	private int nextFrameX;
	private int nextFrameY;
	// �����ڲ�����Ϊ���������1/2��С
	private int width = DESKTOP_WIDTH / 2;
	private int height = DESKTOP_HEIGHT / 2;
	// Ϊ�����ڶ���2���˵�
	JMenu fileMenu = new JMenu("�ļ�");
	// ����newAction���ڴ����˵��͹��߰�ť
	Action newAction = new AbstractAction("�½�", new ImageIcon("ico/new.png")) {
		public void actionPerformed(ActionEvent event) {
			// �����ڲ�����
			final JInternalFrame iframe = new JInternalFrame("���ĵ�",
					true, // �ɸı��С
					true, // �ɹر�
					true, // �����
					true); // ����С��
			iframe.add(new JScrollPane(new JTextArea(8, 40)));
			// ���ڲ�������ӵ�����������
			desktop.add(iframe);
			// �����ڲ����ڵ�ԭʼλ�ã��ڲ�����Ĭ�ϴ�С��0X0������0,0λ�ã�
			iframe.reshape(nextFrameX, nextFrameY, width, height);
			// ʹ�ô��ڿɼ���������ѡ����
			iframe.show();
			// ������һ���ڲ����ڵ�λ��
			nextFrameX += FRAME_DISTANCE;
			nextFrameY += FRAME_DISTANCE;
			if (nextFrameX + width > desktop.getWidth())
				nextFrameX = 0;
			if (nextFrameY + height > desktop.getHeight())
				nextFrameY = 0;
		}
	};
	// ����exitAction���ڴ����˵��͹��߰�ť
	Action exitAction = new AbstractAction("�˳�", new ImageIcon("ico/exit.png")) {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	};

	public void init() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		// Ϊ���ڰ�װ�˵����͹�����
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
		// ������������ӵ�����JFrame������
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
