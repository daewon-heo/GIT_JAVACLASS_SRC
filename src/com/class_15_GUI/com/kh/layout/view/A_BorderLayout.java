package com.class_15_GUI.com.kh.layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {
	public A_BorderLayout(){
		// BorderLayout : 
		//	화면의 각 방향을 동, 서, 남, 북, 가운데로
		//	나누어 요소를 배치하는 레이아웃 방식
		
		// 부모 생성자를 통해 제목을 지을 수 있다.
		super("BorderLayout");
		
		// 프레임의 크기 설정하기
		this.setBounds(300, 300, 500, 500);
		
		// 레이아웃 설정하기
		// 컨테이너에 사용하는 각각의 레이아웃은
		// LayoutManager 인터페이스의 후손 클래스로 
		// 각각의 레이아웃에 대한 기능을 다양하게 제공한다.
		this.setLayout(new BorderLayout());
		
		// 현재 적용된 레이아웃 확인하기
		System.out.println("레이아웃 : " + this.getLayout());
		
		// 레이아웃에 따른 버튼 배치하기
//		JButton northBtn = new JButton("북");
//		JButton eastBtn = new JButton("동");
//		JButton westBtn = new JButton("서");
//		JButton southBtn = new JButton("남");
//		JButton centerBtn = new JButton("가운데");
//		
//		this.add(northBtn, "East");
//		this.add(eastBtn, "North");
//		this.add(westBtn, "West");
//		this.add(southBtn, "South");
//		this.add(centerBtn, "Center");
		
		add(new JButton("북"), "North");
		add(new JButton("동"), "East");
		add(new JButton("서"), "West");
		add(new JButton("남"), "South");
		add(new JButton("가운데"), "Center");
	
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}










