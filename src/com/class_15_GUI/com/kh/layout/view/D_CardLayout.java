package com.class_15_GUI.com.kh.layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{

	public D_CardLayout(){
		// CardLayout : 
		//	하나의 컨테이너 안에
		//	여러 개의 컴포넌트들을 겹쳐 놓고
		//	각각의 컴포넌트에 번호를 매겨
		//	앞장, 뒷장의 배치로
		//	특정 이벤트(마우스 클릭)를 감지할 때
		//	컴포넌트를 변경하여 화면에 보여주는 배치방식
		
		super("CardLayout");
		
		setBounds(300, 300, 500, 800);
		
		CardLayout cards = new CardLayout();
		setLayout(cards);
		
		// JPanel : 컴포넌트(요소) 이면서
		//			하나의 컨테이너 역할을 하는
		//			배치용 컴포넌트
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();

		// 컴포넌트에 배경색 입히기
		card1.setBackground(Color.ORANGE);
		card2.setBackground(Color.BLACK);
		card3.setBackground(Color.RED);
		
		// JLabel : 이름표(평범한 문자열을 표시하기 위한 컴포넌트);
		card1.add(new JLabel("첫번째 카드"));
		card2.add(new JLabel("두번째 카드"));
		card3.add(new JLabel("세번째 카드"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// 각 패널에 이벤트 추가하기
		// EventListner와 EventAdaptor
		// EventListner는 특정 이벤트에 대한
		// 모든 감지요소를 가지고 있는 인터페이스를 말한다.
		// 이러한 이벤트리스너는 인터페이스이기 때문에
		// 사용하지 않는 이벤트가 있더라도 모두 구현을 해주어야 한다.
		// 따라서 만약 이벤트를 여러 개 중에 한 개, 선택하여 사용하고
		// 싶은 때에는 리스너를 상속받은 Adapter를 이용한다.
		card1.addMouseListener(new MouseAdapter() {
			// Ctrl + space bar
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭");
				if(e.getButton() == 1){
					cards.next(card1.getParent());
				}else if(e.getButton() == 3){
					cards.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			// Ctrl + space bar
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭");
				if(e.getButton() == 1){
					cards.next(card2.getParent());
				}else if(e.getButton() == 3){
					cards.previous(card2.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			// Ctrl + space bar
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭");
				if(e.getButton() == 1){
					cards.next(card3.getParent());
				}else if(e.getButton() == 3){
					cards.previous(card3.getParent());
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
