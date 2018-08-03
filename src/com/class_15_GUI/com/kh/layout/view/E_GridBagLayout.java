package com.class_15_GUI.com.kh.layout.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class E_GridBagLayout extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4034648263201311908L;

	public E_GridBagLayout(){
		// GridBagLayout : 
		//	특정한 영역 안의 각 컴포넌트 (요소) 배치를
		//	가로, 세로 기준을 세워 사이즈를
		//	정의한 후 사용하는 배치 방식
		
		super("GridBagLayout");
		
		GridBagLayout gridbag = new GridBagLayout();
		setLayout(gridbag);
		
		// 제약 조건
		// 그리드백레이아웃은
		// 각 행 별로 배치하기 위한 별도의 제약 사항을 가지고 있다
		// 이를 직접 설정하기 위해서는 GridBagConstraint 객체를
		// 생성하여 설정해야 한다.
		
		GridBagConstraints constraint = new GridBagConstraints();
		
		// constraints 로 설정할 수 있는 조건들
		
		constraint.fill = GridBagConstraints.BOTH;
		// BOTH : 가로, 세로를 모두 직접 설정하겠다.
		// HORIZONNTAL : 가로 방향만 설정하겠다.
		// VERTICAL : 세로 방향만 설정하겠다.
		// NONE : 아무것도 변경하지 않겠다
		
		// 각 컴포넌트가 차지할 공간의 비율(가로축에 대한 길이 설정)
		constraint.weightx = 1.0;
		
		JButton btn1 = new JButton("1번 버튼");
/*		gridbag.setConstraints(btn1, constraint);
		add(btn1);
		
		JButton btn2 = new JButton("2번 버튼");
		gridbag.setConstraints(btn2, constraint);
		add(btn2);
		
		JButton btn3 = new JButton("3번 버튼");
		gridbag.setConstraints(btn3, constraint);
		add(btn3);*/
		
		makeMyBtn("1번 버튼", gridbag, constraint);
		makeMyBtn("2번 버튼", gridbag, constraint);
		makeMyBtn("3번 버튼", gridbag, constraint);

		// 한 줄의 마지막 컴포넌트로 설정하겠다.
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		makeMyBtn("4번 버튼", gridbag, constraint);
		
		// 두번째 줄의 공간 크기 설정하기
		constraint.weightx = 0.0;
		makeMyBtn("5번 버튼", gridbag, constraint);
		
		// 두번째 줄의 마지막 위치전까지 설정하기
		constraint.gridwidth = GridBagConstraints.RELATIVE;
		makeMyBtn("6번 버튼", gridbag, constraint);
		
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		makeMyBtn("7번 버튼", gridbag, constraint);
		
		
		constraint.gridwidth = 1;
		constraint.gridheight = 2;
		constraint.weighty = 1.0;
		makeMyBtn("8번 버튼", gridbag, constraint);
		
		setBounds(300, 300, 600, 500);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 그리드백 설정을 적용하기 위한 버튼을
	// 생성하는 기능용 메소드
	public void makeMyBtn(
			String name, // 버튼 이름
			GridBagLayout grid, // 설정할 배치환경
			GridBagConstraints cons // 그리드백의 설정
			){
		
		JButton myBtn = new JButton(name);
		grid.setConstraints(myBtn, cons);
		this.add(myBtn);
	}
}
