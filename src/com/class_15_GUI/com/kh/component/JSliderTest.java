package com.class_15_GUI.com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class JSliderTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7460613023065486011L;
	
	public JSliderTest(){
		super("JSlider Test");
		
		JPanel panel = new JPanel();
		
		JLabel lb = new JLabel("슬라이더를 움직여 보세요.");
		
		panel.add(lb);
		JPanel panel2 = new JPanel();
		
		// 최소값, 최대값, 기본값
		JSlider slider = new JSlider(0, 30, 15);
		slider.setMajorTickSpacing(10); 	// 큰 눈금의 간격
		slider.setMinorTickSpacing(1);      // 작은 눈금의 간격
		slider.setPaintTicks(true);         // 눈금자 표시 유무
		slider.setPaintLabels(true);		// 값을 라벨로 표기
		
		panel2.add(slider);
		
		JButton btn = new JButton("값 확인 : ");
		JTextField text = new JTextField();
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 슬라이더의 값을 가져와
				// 텍스트 필드에 적용하기
				text.setText(slider.getValue() + "");
			}
		});
		
		add(panel, "North");
		add(panel2, "Center");
		add(btn, "East");
		add(text, "South");
		
		setSize(300, 300);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JSliderTest();
	}
}
