package com.langsin.testTABLE;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTable {
	JFrame jf = new JFrame("�򵥱��");
	JTable table;
	// �����ά������Ϊ�������
	Object[][] tableData = {{ "��ΰ��", 29, "Ů" },
			 { "�Ǵ�", 56, "��" }, { "Scott", 35, "��" },
			{ "����", 38, "Ů" }, { "Baby", 2, "��" } };
	// ����һά������Ϊ�б���
	Object[] columnTitle = { "����", "����", "�Ա�" };

	public void init() {
		// �Զ�ά�����һά����������һ��JTable����
		table = new JTable(tableData, columnTitle);
		// ��JTable�������JScrollPane�У�������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleTable().init();
	}
}
