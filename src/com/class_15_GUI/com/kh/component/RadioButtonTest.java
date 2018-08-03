package com.class_15_GUI.com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6688258282163620479L;

	public RadioButtonTest(){
		super("커피사이즈 선택하기");
		
		// 컨테이너 안에 담을 JPanel
		JPanel pan = new JPanel();
		
		JLabel lb = new JLabel("어떤 커피를 고르실래요?");
		
		pan.add(lb);
		
		JPanel pan2 = new JPanel();
		
		// 라디오 버튼 만들기
		JRadioButton btn1 = new JRadioButton("Small Size");
		JRadioButton btn2 = new JRadioButton("Regular Size");
		JRadioButton btn3 = new JRadioButton("Tall Size");
		
		// 라디오 그룹
		// 라디오 버튼들은 하나의 그룹에 속해있지 않으면
		// 각각을 별개의 버튼으로 인식한다.
		// 따라서, 라디오 버튼을 올바르게 동작시키려면
		// 버튼을 그룹에 묶어야 한다.
		
		ButtonGroup sizeGp = new ButtonGroup();
		sizeGp.add(btn1);
		sizeGp.add(btn2);
		sizeGp.add(btn3);
		
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		// 클릭한 결과에 따른 결과 내용을 보여줄 JPanel
		JPanel resultPan = new JPanel();
		JLabel resultLb = new JLabel("크기가 선택되지 않았습니다.");
		
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 버튼이 클릭되었을때 동작할 내용
//				resultLb.setText("Small 사이즈가 선택되었습니다.");
//			}
//		});
//		
//		btn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 버튼이 클릭되었을때 동작할 내용
//				resultLb.setText("Regular 사이즈가 선택되었습니다.");
//			}
//		});
//		
//		btn3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 버튼이 클릭되었을때 동작할 내용
//				resultLb.setText("Tall 사이즈가 선택되었습니다.");
//			}
//		});
		
		AddActionLister(btn1, resultLb);
		AddActionLister(btn2, resultLb);
		AddActionLister(btn3, resultLb);
		resultPan.add(resultLb);
		
		add(pan, "North");
		add(pan2, "Center");
		add(resultPan, "South");
		
		setBounds(300, 300, 500, 400);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void AddActionLister(JRadioButton btn, JLabel resultLb){
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLb.setText(btn.getText() + "가 선택되었습니다.");
			}
		});
	}

	public static void main(String[] args) {
		// 라디오 버튼을 테스트할 실행 메소드
		new RadioButtonTest();
	}
}
