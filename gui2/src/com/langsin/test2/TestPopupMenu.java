package com.langsin.test2;

import java.awt.*;
import java.awt.event.*;

public class TestPopupMenu {
	private TextArea ta = new TextArea(4, 30);
	private Frame f = new Frame("����");
	PopupMenu pop = new PopupMenu();
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
	MenuItem copyItem = new MenuItem("����");
	MenuItem pasteItem = new MenuItem("ճ��");
	Menu format = new Menu("��ʽ");
	// ����commentItem�˵��ָ��ʹ�� Ctrl+Shift+/ ��ݼ�
	MenuItem commentItem = new MenuItem("ע��", new MenuShortcut(
			KeyEvent.VK_SLASH, true));
	MenuItem cancelItem = new MenuItem("ȡ��ע��");

	public void init() {
		// �������ڲ������ʽ�����˵�������
		ActionListener menuListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				ta.append("������" + cmd + "���˵�" + "\n");
				if (cmd.equals("�˳�")) {
					System.exit(0);
				}
			}
		};
		// ΪcommentItem��exitItem�����˵���������¼���������
		commentItem.addActionListener(menuListener);
		// Ϊpop�˵���Ӳ˵���
		pop.add(autoWrap);
		// ʹ��addSeparator��������Ӳ˵��ָ���
		pop.addSeparator();
		pop.add(copyItem);
		pop.add(pasteItem);
		// Ϊformat�˵���Ӳ˵���
		format.add(commentItem);
		format.add(cancelItem);
		// ʹ�����new MenuItem("-")�ķ�ʽ��Ӳ˵��ָ���
		pop.add(new MenuItem("-"));
		// ��format�˵���ϵ�pop�˵��У��Ӷ��γɶ����˵�
		pop.add(format);

		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300, 160));
		// ��p���������PopupMenu����
		p.add(pop);
		p.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					pop.show(p, e.getX(), e.getY());
				}
			}
		});
		f.add(p);
		f.add(ta, BorderLayout.NORTH);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TestPopupMenu().init();
	}
}
