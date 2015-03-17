package com.langsin.testTABLE;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTable {
	JFrame jf = new JFrame("简单表格");
	JTable table;
	// 定义二维数组作为表格数据
	Object[][] tableData = {{ "胡伟红", 29, "女" },
			 { "盖茨", 56, "男" }, { "Scott", 35, "男" },
			{ "王菲", 38, "女" }, { "Baby", 2, "男" } };
	// 定义一维数据作为列标题
	Object[] columnTitle = { "姓名", "年龄", "性别" };

	public void init() {
		// 以二维数组和一维数组来创建一个JTable对象
		table = new JTable(tableData, columnTitle);
		// 将JTable对象放在JScrollPane中，并将该JScrollPane放在窗口中显示出来
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleTable().init();
	}
}
