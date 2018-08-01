package com.class_14_Collections.com.kh.generics;

public class TestMyGeneric {
	public static void main(String[] args) {
		// 내가 만든 제한 자료형을 가진 MyGeneric 테스트
		
		String[] arr = {"one", "two", "three", "four", "five"};
		
		MyGenerics<String> my1 = new MyGenerics<String>(arr);
		my1.output();
		
		// 제네릭에 기본 자료형을 적용시키고자 한다면
		// 반드시 래퍼클래스로 박싱처리를 한 후에
		// 적용해야 한다.
		// 
		
		Integer[] iarr = {10,20,30,40,50};
		MyGenerics<Integer> my2 = new MyGenerics<Integer>(iarr);
		my2.output();
		
	}
}
