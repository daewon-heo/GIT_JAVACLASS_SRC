package com.class_15_GUI.com.kh.layout.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class G_PanelLayout extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4301690957688250253L;
	
	public G_PanelLayout(){
		// 레이아웃은 JFrame 뿐만 아니라,
		// JPanel 컴포넌트에도 적용할 수 있다.
		
		// JPanel의 기본 레이아웃은 FlowLayout이다.
		super("PanelLayout");
		
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
		
		// JPanel을 생성하여 위의 컴포넌트 추가하기
		JPanel pan = new JPanel();
		
		pan.setBounds(0, 0, 450, 450);
		pan.setBackground(Color.YELLOW);
		
		pan.add(label);
		pan.add(textField);
		pan.add(btn);
		
		add(pan);
		
		setBounds(300, 300, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
