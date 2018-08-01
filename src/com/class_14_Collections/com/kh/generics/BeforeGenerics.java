package com.class_14_Collections.com.kh.generics;

import java.util.ArrayList;

// 하나의 파일안에 여러 개의 클래스를 
// 작성할 수 있는데, 이때에는 
// 해당 파일을 대표하는 클래스 반드시 선정하여야 한다.
// 해당 파일을 대표하는 클래스는 class 앞에 public 을
// 사용하고, 하나의 파일에 반드시 한개만 public class로 
// 선언할 수 있다.

public class BeforeGenerics {

	public static void main(String[] args) {
		// 컬렉션에는 여러가지 자료형을 담을 수 있다.
		// 컬렉션(list, set, map)
		//

		ArrayList list = new ArrayList();
		list.add(new String("12345"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());

		System.out.println("저장된 객체 수 : " + list.size());
		System.out.println("list : " + list);
		
		// 각 형태별로 객체를 꺼내고자 할 경우
		
		// 책만 꺼내고 싶어요~
		for(int i = 0 ; i < list.size(); i++){
			Object obj = list.get(i);
			if(obj instanceof Book){
				System.out.println("책 객체 : " + obj);
			}
		}
		
		// 책, 자동차, 학생, 일반 문자열 각각 꺼내고 싶어요!
		for(int i = 0 ; i < list.size(); i++){
			Object obj = list.get(i);
			
			if(obj instanceof Book){
				// 책에 대한 내용
			}else if(obj instanceof Car){
				// 자동차에 대한 내용
			}else if(obj instanceof Student){
				// 학생에 대한 내용
			}else if(obj instanceof String){
				// 일반 문자열에 대한 내용
			}else{
				// 다른 객체일 경우 실행할 내용
			}
		}
	}
}

class Book {
	private String bNo;

	public Book() {
	}

	public Book(String bNo) {
		this.bNo = bNo;
	}

	@Override
	public String toString() {
		return "나는 " + bNo + " 책입니다.";
	}
}

class Student {
	private String stuNo;

	public Student() {
	}

	public Student(String stuNo) {
		this.stuNo = stuNo;
	}

	@Override
	public String toString() {
		return "나는 학생입니다.";
	}
}

class Car {
	private String model;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "나는 " + model + " 자동차입니다.";
	}
}
