package com.class_15_GUI.com.kh.component;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5062632441199980638L;
	
	public TextTest(){
		super("TextTest");
		
		setLayout(new GridLayout(3, 2));
		
		JLabel lb1 = new JLabel("이름");
		JTextField txf = new JTextField();
		
		JLabel lb2 = new JLabel("비밀번호");
		JPasswordField psf = new JPasswordField();
		
		JLabel lb3 = new JLabel("비고");
		JTextArea area = new JTextArea();
		
		add(lb1);
		add(txf);
		add(lb2);
		add(psf);
		add(lb3);
		add(area);
		
		
		setBounds(200, 200, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 각각의 컴포넌트를 실행할 수 있는
	// 테스트용 실행 메소드
	public static void main(String[] args) {
		TextTest tt = new TextTest();
		
	}

}
