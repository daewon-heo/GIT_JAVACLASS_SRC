package com.class_15_GUI.com.kh.layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	public B_FlowLayout(){
		// FlowLayout : 
		//	컨테이너 안에 컴포넌트(요소)들을 추가할 때
		//	왼쪽, 오른쪽, 가운데 정렬을 할 수 있는 배치 방식
		
		super("FlowLayout");
		
		this.setBounds(300, 300, 800, 500);
		
//		this.setLayout(new FlowLayout());
//		System.out.println("레이아웃 : " +  this.getLayout());
		
		// FlowLayout은 컴포넌트들을 배치할 때
		// 미리 설정한 배치방식으로 한 개 씩 배치하는데
		// 기본적으로 한 줄씩 배치하나,
		// 만약 컴포넌트의 크기가 주어진 화면의 길이를 넘어서거나
		// 화면을 축소, 확대 시킬 때 설정한 정렬 방식에
		// 맞게 컴포넌트들을 재배치 한다.
		
		// 1. 컴포넌트 정렬 방식 설정
		// Layout 설정 시에 정렬값도 같이 줄 수 있는데,
		// 정렬값을 주지 않을 경우 기본값으로 CENTER가 들어간다.
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		this.setLayout(new FlowLayout(FlowLayout.LEADING));	 // 왼쪽 정렬
		this.setLayout(new FlowLayout(FlowLayout.TRAILING)); // 오른쪽 정렬
			

		// 2. 버튼 추가하기 (15개)
		for (int i = 1; i < 16; i++) {
			this.add(new JButton(i + "번"));
		}
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
