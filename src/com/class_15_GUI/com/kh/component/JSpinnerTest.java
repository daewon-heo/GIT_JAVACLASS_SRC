package com.class_15_GUI.com.kh.component;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class JSpinnerTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7014919853066868859L;
	
	public JSpinnerTest(){
		super("JSpinner Test");
		
		String[] items = {
			"소설",
			"잡지",
			"전공서적",
			"스포츠",
		};
		
		// Spinner 전용 모델 객체 생성하기
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner sp1 = new JSpinner(listModel);
		
		// 일반 숫자 데이터를 기준으로 스피너 객체 만들기
		
		// 시작값, 최소값, 최대값, 증가값(step)
		SpinnerModel numberModel = new SpinnerNumberModel(1, 0, 10, 2);
		
		JSpinner sp2 = new JSpinner(numberModel);
		
		
		add(sp1);
		add(sp2);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JSpinnerTest();
	}
}
