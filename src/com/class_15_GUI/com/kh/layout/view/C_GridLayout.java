package com.class_15_GUI.com.kh.layout.view;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	public C_GridLayout(){
		// GridLayout:
		//	컴포넌트 들을 가로, 세로로 균등하게 배치할 때
		//	사용하는 배치 방식으로, 보통 윗줄 부터
		//	아랫줄의 순서로 왼쪽부터 오른쪽으로
		//	정렬하여 배치한다.
		
		super("Grid Layout");
		
		setBounds(300, 300, 500, 500);
		
		// GridLayout은 선언 시에
		// 매개변수를 받을 수 있는데
		// 매개변수의 순서에 따라
		// 가로 줄, 세로 줄, 가로 공간 크기, 세로 공간 크기 
		// 설정할 수 있다.
		setLayout(new GridLayout(5,5, 10, 20));
		
//		for(int i = 1; i < 26; i++){
//			add(new JButton(i + " 번"));
//		}
		
		// 랜덤 빙고판 만들기
		// 1 ~ 25 까지 중복이 없는 빙고판 만들기
		Set<Integer> binggoNum = new LinkedHashSet<Integer>();
		
		while(binggoNum.size() < 25){
			int rnum = (int)(Math.random()*25) + 1;
			binggoNum.add(rnum);
		}
		
		// 1. toArray()
		
		// 2. Iterator
		Iterator<Integer> iter = binggoNum.iterator();
		
		while(iter.hasNext()){
			this.add(new JButton(iter.next() + "번"));
		}
		
		
//		for(Integer num : binggoNum){
//			add(new JButton(num.toString()));
//		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
