package com.class_14_Collections.com.kh.generics;

public class MyGenerics<T> {
	// 제네릭 타입의 T(type) 는
	// 처음에 부여된 제한 자료형을 
	// 기억하고, 해당 자료형으로 제한하는 키워드 이다.
	
	private T[] array;
	
	public MyGenerics(T[] array){
		this.array = array;
	}
	
	public void output(){
		for(T obj : array){
			System.out.println(obj);
		}
	}
}
