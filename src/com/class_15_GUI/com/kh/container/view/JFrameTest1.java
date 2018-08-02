package com.class_15_GUI.com.kh.container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	// 컨테이너 : 
	//	화면에 표시하고자 하는 요소(컴포넌트)들을
	//	담을 수 있는 객체를 컨테이너라고 한다.
	//	대표적으로 JFrame객체가 해당하며
	//	예외적으로 컴포넌트 이면서 컨테이너 역할을 하는
	//	Panel/JPanel 객체가 있다.
	
	// 컨테이너인 Frame을 생성하는 방법1
	// JFrame을 상속 받아 사용하는 방법
	//	javax.swing.JFrame 클래스를 상속받은 후에
	//	해당 프레임에 크기, 열리는 위치를 설정하여 
	//	생성자를 통해 실행하면 된다.
	
	public JFrameTest1(){
//		// 프레임의 크기 설정하기
//		this.setSize(400, 200);
//		// 프레임이 시작되는 위치 설정하기
//		this.setLocation(300, 300);
		
		// 프레임의 위치와 크기를 한번에 설정하기
		this.setBounds(200, 100, 500, 400);
		
		// 프레임을 종료하더라도, 실제 프로그램이 종료되지
		// 않을 때 닫기 버튼(x)을 클릭했을 때 강제로 프로그램
		// 자체를 종료하게 설정할 수 있는데,
		// 해당 기능을 설정하는 메소드가
		// setDefaultCloseOperation() 메소드이다.
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 프레임 최상단에 제목 짓기
		this.setTitle("My JFrame");
		
		// 프레임의 사이즈를 변경하지 못하게 막기
		this.setResizable(false);
		
		// 프레임에 내가 원하는 아이콘 설정하기
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
		} catch (IOException e) {
			System.out.println("이미지 파일 오류 발생!");
		}
		
		
		// 구성한 프레임을 화면에 표시하기 위한 
		// visible 설정 메소드(true : 보여주겠다)
		this.setVisible(true);
	}
}
