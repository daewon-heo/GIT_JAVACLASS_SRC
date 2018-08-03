package com.class_15_GUI.com.kh.component;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class JListTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1270515779025920201L;

	public JListTest(){
		super("JList Test");

		JPanel listPan = new JPanel();
		JPanel pan = new JPanel();
		
		String[] cities = {
				"런던",
				"제주도",
				"부산",
				"보령",
				"대천",
				"괌",
				"하와이",
				"세부",
				"지리산",
				"한라산",
				"백두산",
				"몰디브"
		};

		JList<String> list = new JList<String>(cities);
		
		
		// 리스트 경계선 설정하기
		list.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		
		// 리스트 스크롤바 생성하기
		// 일반 Panel과 같이 컴포넌트들을 담을 수 있는
		// 컨테이너 역할을 하는 캄포넌트
		// 특징 : 만약 내부의 내용이 현재 패널의 사이즈를 
		// 초과할 경우 스크롤 바를 직접 만들어서 화면에 표시한다.
		JScrollPane scroll = new JScrollPane(list);
		
		listPan.add(scroll);
		add(listPan);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
