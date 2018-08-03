package com.class_15_GUI.com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1790097094868438340L;
	
	public TextFieldTest(){
		// 숫자를 입력받아 제곱한 결과를 돌려수는 
		// 제곱수 계산기 만들기
		super("제곱수 계산기");
		
		// 컴포넌트들을 담을 JPanel 생성하기
		JPanel pan = new JPanel();
		
		
		// JPanel 에 글자 추가하기
		JLabel lb = new JLabel("숫자 입력 : ");
		
		// 사용자가 입력할 숫자를 받을 컴포넌트
		JTextField txf = new JTextField(15);
		
		// ----------- 출력부 -----------
		JLabel lb2 = new JLabel("결과 확인 : ");
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		
		// 결과를 계산할 때 쓰일 버튼 만들기
		JButton btn = new JButton("확인");
		
		// 버튼에 이벤트 연결하기(바인드)
		//	버튼을 클릭했을 때 실행할 구문을
		//	작성한다.
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 결과 확인 버튼이 클릭되었을 대
				// 실행할 코드를 구현하는 부분
				
				// 1. 버튼 클릭 시에 텍스트필드의 값을 가져와서 
				//	    숫자인지 확인하고, 숫자라면 파싱처리한다.
				String text = txf.getText();
				int num = 0;
				
				try{
					num = Integer.parseInt(text);
					
					// 2. 파싱처리한 숫자를 제곱하여
					//    결과 텍스트 필드에 입력한다.
					result.setText(String.valueOf(num*num));
				}catch (NumberFormatException excep) {
					result.setText("숫자가 아닙니다.");
				}
				
				
			}
		});
		
		pan.add(lb);
		pan.add(txf);
		pan.add(lb2);
		pan.add(lb2);
		pan.add(result);
		pan.add(btn);
		
		add(pan);

		setBounds(300, 300, 300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TextFieldTest();

	}

}
