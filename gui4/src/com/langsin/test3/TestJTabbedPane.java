package com.langsin.test3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class TestJTabbedPane {

	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();
	JPanel jp5 = new JPanel();

	JFrame jf = new JFrame("����Tabҳ��");
	// ����һ��Tabҳ��ı�ǩ������ߣ����û��в��ֲ��Ե�JTabbedPane
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT,
			JTabbedPane.WRAP_TAB_LAYOUT);
	String[] layouts = { "���в���", "����������" };
	String[] positions = { "���", "����", "�ұ�", "�ײ�" };

	public void init() {
		String tip = "������ʾ";
		// ��JTabbedPane�����5��Tabҳ�棬ָ���˱��⡢ͼ�����ʾ������Tabҳ������Ϊnull
		tabbedPane.addTab("jp1", null, null, tip);
		tabbedPane.addTab("jp2", null, null, tip);
		tabbedPane.addTab("jp3", null, null, tip);
		tabbedPane.addTab("jp4", null, null, tip);
		tabbedPane.addTab("jp5", null, null, tip);
		jf.add(tabbedPane, BorderLayout.CENTER);
		// ΪJTabbedPane����¼�������
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				// �����ѡ��������Ȼ�ǿ�
				if (tabbedPane.getSelectedComponent() == null) {
					// ��ȡ��ѡTabҳ
					int n = tabbedPane.getSelectedIndex();
					// Ϊָ����ǰҳ��������
					loadTab(n);
				}
			}
		});
		// ϵͳĬ��ѡ���һҳ�����ص�һҳ����
		loadTab(0);
		tabbedPane.setPreferredSize(new Dimension(500, 300));
		// ���ӿ��Ʊ�ǩ���֡���ǩλ�õĵ�ѡ��ť
		JPanel buttonPanel = new JPanel();
		ChangeAction action = new ChangeAction();
		buttonPanel.add(new ButtonPanel(action, "ѡ���ǩ���ֲ���", layouts));
		buttonPanel.add(new ButtonPanel(action, "ѡ���ǩλ��", positions));
		jf.add(buttonPanel, BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);

	}

	// Ϊָ����ǩҳ��������
	private void loadTab(int n) {
		String title = tabbedPane.getTitleAt(n);
		tabbedPane.setComponentAt(n, new JLabel("���ǵڸ�" + n + "���"));
		// ���ݱ�ǩҳ�ı����ȡ��Ӧͼ�����
	}

	// ����ı��ǩҳ�Ĳ��ֲ��ԣ�����λ�õļ�����
	class ChangeAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JRadioButton source = (JRadioButton) event.getSource();
			String selection = source.getActionCommand();
			if (selection.equals(layouts[0])) {
				tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
			} else if (selection.equals(layouts[1])) {
				tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			} else if (selection.equals(positions[0])) {
				tabbedPane.setTabPlacement(JTabbedPane.LEFT);
			} else if (selection.equals(positions[1])) {
				tabbedPane.setTabPlacement(JTabbedPane.TOP);
			} else if (selection.equals(positions[2])) {
				tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
			} else if (selection.equals(positions[3])) {
				tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
			}
		}
	}

	public static void main(String[] args) {
		new TestJTabbedPane().init();
	}
}

// ����һ��JPanel����չ�࣬����Ķ����������������е�JRadioButton�ؼ�
// ��Panel��չ�����ָ��һ���ַ�����ΪTitledBorder
class ButtonPanel extends JPanel {
	private ButtonGroup group;

	public ButtonPanel(TestJTabbedPane.ChangeAction action, String title,
			String[] labels) {
		setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), title));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		group = new ButtonGroup();
		for (int i = 0; labels != null && i < labels.length; i++) {
			JRadioButton b = new JRadioButton(labels[i]);
			b.setActionCommand(labels[i]);
			add(b);
			// ����¼�������
			b.addActionListener(action);
			group.add(b);
			b.setSelected(i == 0);
		}
	}
}
