package com.class_15_GUI.com.kh.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBokxTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4262733237090380165L;
	
	public CheckBokxTest(){
		super("과일 선택하기");
		
		String[] fruitNames = {
				"오렌지",
				"메론",
				"복숭아",
				"망고",
				"사과"
		};
		JCheckBox[] boxes = new JCheckBox[5];
		
		// 각각의 과일에 해당하는 체크박스 생성 반복문
		for(int i = 0 ; i < boxes.length; i++){
			boxes[i] = new JCheckBox(fruitNames[i]);
		}
		
		JPanel pan = new JPanel();
		
		for (int i = 0; i < boxes.length; i++) {
			pan.add(boxes[i]);
		}
		
		JLabel lb = new JLabel("선택한 과일이 없습니다.");
		// 이벤트도 반복문으로 처리할 수 있다.
		for (int i = 0; i < boxes.length; i++) {
			
			// 특정 리스트, 배열에 대한 이벤트를 담당하는 인터페이스
			boxes[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// 선택한 요소의 값이 변경되었을 때
					// 동작하는 이벤트로 체크 박스의 경우
					// V로 체크하면 true, 
					// 체크를 해제하면 false를 감지한다.
					
					String result = "";
					int count = 0; // 체크한 과일 갯수 세기
					
					// 체크되어 있는 과일의 이름을 가져와서
					// 라벨에 붙여 쓰기
					for (int j = 0; j < boxes.length; j++) {
						// 현재 순번의 과일 버튼이 선택되었는지 확인
						// 선택되었다면 true / 아니면 false
						if(boxes[j].isSelected()){
							result += boxes[j].getText() + " ";
							count++;
						}
						
						lb.setText(result);
					}
					
					if(count == 0){
						lb.setText("선택한 과일이 없습니다.");
					}
				}
			});
		}
		
		add(pan, "Center");
		add(lb, "South");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// 체크박스를 테스트 하기 위한 실행 메소드
		new CheckBokxTest();
	}
}
