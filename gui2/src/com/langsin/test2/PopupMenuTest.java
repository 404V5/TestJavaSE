package com.langsin.test2;

import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenuTest {

	
	
	public static void main(String[] args) {
		
		final JPopupMenu pop = new JPopupMenu();
		JMenuItem copyItem = new JMenuItem("复制");
		JMenuItem pasteItem = new JMenuItem("粘贴");
		JMenu format = new JMenu("格式");
		
		pop.add(copyItem);
		
		
		
		final MyPoint mp = new MyPoint();
		
		
		
		final JFrame jf = new JFrame("测试菜单");
		jf.setSize(600,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				mp.setX( e.getX());
				mp.setY(e.getY());
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()){
					pop.show(jf, mp.getX(),mp.getY());
				}
			}
		});
		
		
		
		
	}
}
