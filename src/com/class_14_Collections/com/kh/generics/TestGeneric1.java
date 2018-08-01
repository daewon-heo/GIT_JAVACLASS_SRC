package com.class_14_Collections.com.kh.generics;

import java.util.ArrayList;

public class TestGeneric1 {
	public static void main(String[] args) {
		// 제네릭스란, 여러가지 자료형을  받을 수 있는
		// 컬렉션에 저장할 자료형을 한 가지로 제한함으로써
		// 객체를 꺼내어 사용할 때 객체에 대한 형변환을
		// 생략하게 하는 기능이다.

		// Book --> Object (X)
		// Book --> Book (0)
		
		// 사용방법 : 
		// 컬렉션 클래스 변수명<제한할 자료형명>
		
		// 책만 받기 위한 리스트
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		list.add(new Book());
		// 리스트에 Book객체만 받도록 한정지었기 때문에
		// Book 객체나, Book의 자식 객체만 저장할 수 있다.
		// list.add(new String("12344"));
		
		list2.add(new Book());
		list2.add(new String("12345"));
		
		// Book만 받도록 한정지은 컬렉션 객체
		for(Book bk : list){
			// list안에 Book 객체만 들어있기 때문에
			// Book형태로 굳이 형변환 하지 않고도
			// 사용이 가능하다.
			System.out.println(bk);
		}
		
		// 기존의 일반 컬렉션 객체
		for(Object obj : list2){
			// list 안에 어떠한 자료형이 담겨있을지 모르기 때문에
			// Object형태로 받은 다음 Book 객체로 변환이
			// 가능한지확인이 필요하다 (instanceof 연산자가 필요)
			Book bk = (Book)obj;
			
			System.out.println(bk);
		}
	}
}
