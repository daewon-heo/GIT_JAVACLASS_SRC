package com.class_15_GUI.com.kh.component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageIconTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6758822383649702903L;

	public ImageIconTest(){
		super("이미지 표시 및 변경하기");
		
		JPanel pan = new JPanel();
		
		// 이미지를 컨테이너에 삽입할 때에는
		// 먼저 화면에 표시할 이미지의 크기를 설정해야 한다.
		
		Image myImg = new ImageIcon("images/user.png").getImage().getScaledInstance(150, 150, 0);
		JLabel lb = new JLabel(new ImageIcon(myImg));
		pan.add(lb);
		
		JButton btn = new JButton("이미지 변경");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 해당 버튼이 클릭되었을 때
				// 보여주는 이미지 객체를 바꾸면 이미지가 변경된다.
				Image myImg = new ImageIcon("images/dog.png").getImage().getScaledInstance(150, 150, 0);
				
				lb.setIcon(new ImageIcon(myImg));
			}
		});
		
		
		
		add(pan, "Center");
		add(btn, "South");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// 이미지를 화면에 표시하고 변경하는 이벤트를 테스트하기 위한
		// 실행 메소드
		new ImageIconTest();
	}
}
