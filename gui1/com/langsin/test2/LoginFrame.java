package com.langsin.test2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;

public class LoginFrame extends JFrame {

	private JTextField username; 
	private JPasswordField password;
	
	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			LoginFrame frame = new LoginFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame
	 */
	public LoginFrame() {
		super();
		getContentPane().setLayout(null);
		setSize(383, 307);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JLabel username1 = new JLabel();
		username1.setFont(new Font("", Font.PLAIN, 14));
		username1.setText("用户名");
		username1.setBounds(24, 45, 60, 15);
		getContentPane().add(username1);

		final JLabel password1 = new JLabel();
		password1.setFont(new Font("Dialog", Font.PLAIN, 14));
		password1.setText("密 码");
		password1.setBounds(24, 92, 60, 15);
		getContentPane().add(password1);
		final JLabel message = new JLabel();
		message.setBounds(77, 200, 60, 15);
		getContentPane().add(message);
		password = new JPasswordField();
		password.setBounds(106, 89, 200, 21);
		getContentPane().add(password);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if("zhangsan".equals(username.getText()) && "123".equals(new String(password.getPassword()))){
					System.out.println("登陆成功");
					setVisible(false);
					MainFrame.main(null);
				}else{
					message.setText("用户名密码不匹配");
				}
			}
		});
		button.setText("登陆");
		button.setBounds(197, 152, 99, 23);
		getContentPane().add(button);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setText("记住密码");
		checkBox.setBounds(77, 152, 103, 23);
		getContentPane().add(checkBox);

		final JButton button_1 = new JButton();
		button_1.setText("重写");
		button_1.setBounds(195, 196, 99, 23);
		getContentPane().add(button_1);

		

		username = new JTextField();
		username.setBounds(106, 42, 200, 21);
		getContentPane().add(username);
		//
	}

}
