package com.class_15_GUI.com.kh.container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest2 {
	// 프레임(컨테이너객체)을 생성하는 방법2
	// JFrame 객체를 하나 생성한 후에
	// 설정값을 직접 변경하여 사용하면 된다.
	
	public void showJFrame(){
		JFrame mainFrm = new JFrame();
		
		// 프레임의 위치와 크기를 설정하는 메소드
//		mainFrm.setBounds(400,300,500,300);

		// Rectangle (사각형) 클래스를 활용하여
		// 프레임의 위치와 크기를 설정할 수도 있다.
		Rectangle r = new Rectangle(300, 300, 200, 150);
		mainFrm.setBounds(r);
		
		
		// 종료 관련 메소드
		mainFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 타이틀 설정하기
		mainFrm.setTitle("나의 JFrame ^_^");
		
		// 리사이즈를 불가능하게
		mainFrm.setResizable(false);
		
		try {
			mainFrm.setIconImage(ImageIO.read(new File("images/icon.PNG")));
		} catch (IOException e) {
			System.out.println("이미지 읽기 실패!asd");
		}
		
		mainFrm.setVisible(true);
		
		
	}
}
