package com.class_15_GUI.com.kh.component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4786508634037048978L;

	public ComboBoxTest(){
		super("콤보박스");
		
		// images 안에 있는 사진과 같은 이름을 설정하여
		// 이후 이미지 변경시에 활용하기
		
		String[] animal = {
				"cat",
				"dog",
				"tiger"
		};
		
		JComboBox animalList = new JComboBox(animal);
		
		// 처음 시작시 기본값으로 선택할 순서를 설정하기
		//
		animalList.setSelectedIndex(2);
		
		JLabel lb = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 어떤 메뉴를 선택했는지 확인하고 해당 요소를 가져오기
				JComboBox box = (JComboBox)e.getSource();
				
				String name = (String)box.getSelectedItem();
				
				Image myImg = new ImageIcon("images/" + name + ".png").getImage().getScaledInstance(150, 150, 0);
				
				lb.setIcon(new ImageIcon(myImg));
			}
		});
		
		add(animalList, "North");
		add(lb,"Center");
		
		setSize(300, 200);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ComboBoxTest();
	}
}
