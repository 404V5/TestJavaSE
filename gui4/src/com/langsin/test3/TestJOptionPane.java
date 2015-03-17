package com.langsin.test3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestJOptionPane {

	public static void main(String[] args) {
		final JFrame jf = new JFrame();
		jf.setVisible(true);
		JButton jb = new JButton("ok");
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				 JOptionPane.showMessageDialog(jf, "alert1", "alert2",
//				 JOptionPane.PLAIN_MESSAGE);
				
				
//				int i =JOptionPane.showConfirmDialog(null, 
//						"choose one", "choose one", JOptionPane.YES_NO_OPTION);
//				System.out.println(i);
				
//
//				Object[] options = { "OK", "CANCEL","no" };
//				int i = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", 
//				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
//				null, options, options[1]);
//				System.out.println(i);
				
				
				
//				String inputValue = JOptionPane.showInputDialog("Please input a value"); 
//				System.out.println(inputValue);
//				
				Object[] possibleValues = { "First", "Second", "Third" };
				Object selectedValue = JOptionPane.showInputDialog(null, 
				"Choose one", "Input",
				JOptionPane.INFORMATION_MESSAGE, null,
				possibleValues, possibleValues[0]);

			}
		});

		jf.add(jb);
		jf.pack();
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}
