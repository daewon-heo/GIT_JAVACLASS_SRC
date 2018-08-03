package com.class_15_GUI.com.kh.layout.view;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F_NullLayout extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 454281949414943519L;
	
	public F_NullLayout(){
		// NullLayout(AbsoluteLayout) : 
		//	별다른 레이아웃을 지정하지 않고
		//	개발자가 원하느는 위치에 직접 컴포넌트를 배치하는 방식
		super("NullLayout");
		
		setBounds(300, 300, 600, 500);
		
		// 레이아웃을 사용하지 않겠다!
		setLayout(null);
		
		JLabel label = new JLabel("이름 : ");
		label.setLocation(50, 100);
		label.setSize(150, 50);
		
		// 화면에 글을 입력할 수 있는 컴포넌트 입니다.
		JTextField textField = new JTextField(20);
		textField.setLocation(150, 100);
		textField.setSize(150,50);
		
		JButton btn = new JButton("로그인");
		btn.setLocation(300, 100);
		btn.setSize(100, 50);
		
		// 생성한 컴포넌트 배치하기
		add(label);
		add(textField);
		add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
