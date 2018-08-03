package com.class_15_GUI.com.kh.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3133786117178200273L;

	public TextAreaTest(){
		super("TestAreaTest");
		
		// 컨테이너에 담을 JPanel
		JPanel pan = new JPanel();
		
		// nesw - 동서남북
		pan.setLayout(new BorderLayout());
		
		// TextArea
		JTextArea area = new JTextArea(10, 30);
		
		// TextField
		JTextField txf = new JTextField(30);
		txf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 특정 이벤트가 발생했을때
				// 텍스트 에리어에 값을 전달하는 기능
				String str = txf.getText();
				area.append(str + "\n");
				
				// 텍스트 필드를 비운다.
				txf.setText("");
			}
		});
		
		pan.add(txf,  "South");
		pan.add(area, "Center");
		
		add(pan);
		
		setBounds(300, 300, 500, 500);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// 텍스트 에리어 테스트용 실행 메소드
		new TextAreaTest();
	}
}
