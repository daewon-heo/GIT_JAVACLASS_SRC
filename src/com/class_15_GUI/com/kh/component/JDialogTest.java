package com.class_15_GUI.com.kh.component;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JDialogTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3546370420201295881L;
	
	public JDialogTest(){
		super("JDialogTest");
		
		JPanel pan = new JPanel();
		JButton btn1 = new JButton("기본 다이얼로그");
		
		// 다이얼로그
		Dialog dl = new Dialog(this, "기본 다이얼로그 입니다.");
		dl.setBounds(300, 300, 150, 150);
		dl.add(new JLabel("기본 다이얼로그 테스트 입니다."));

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭하면 다이얼로그 표시하기
				dl.setVisible(true);
			}
		});
		
		JButton btn2 = new JButton("닫기 버튼");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭하면 다이얼로그 닫기
				dl.dispose();
			}
		});
		
		// 값을 입력받는 JOptionPanel 사용하기
		JButton btn3 = new JButton("입력값받는 알람창");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭 시 값을 입력 받는 알람창 띄우기
				String result =
						JOptionPane.showInputDialog("값을 입력하세요.");
				
				System.out.println("result : " + result);
			}
		});
			
	
		pan.add(btn2);
		pan.add(btn1);
		pan.add(btn3);
		
		add(pan);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JDialogTest();
	}
}
