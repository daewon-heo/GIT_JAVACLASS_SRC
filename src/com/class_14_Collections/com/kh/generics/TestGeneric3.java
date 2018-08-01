package com.class_14_Collections.com.kh.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestGeneric3 {
	
	public static void main(String[] args) {
		// 맵에 제네릭 적용하기
		HashMap<String, Book> hmap = new HashMap<String, Book>();
		
		inputMap(hmap);
		
		outputMap(hmap);
	}
	
	public static void inputMap(HashMap<String, Book> hmap){
		// 전달 받은 HashMap에 객체 저장하기
		hmap.put("1", new Book("갈매기의 꿈"));
		hmap.put("2", new Book("어린왕자"));
		hmap.put("3", new Book("나의라임오렌지나무"));
		hmap.put("4", new Book("헬렌켈러 위인전"));
		hmap.put("5", new Book("무인도에서 살아남기"));
		
		System.out.println("총" + hmap.size() + "권의 책이 저장되었습니다.");
	}
	
	public static void outputMap(HashMap<String, Book> hmap){
		// 매개변수로 hashMap을 받아
		// 목록화하여 키와 값을 한 개씩 꺼내는 메소드
		
		// 1. keySet() 메소드를 사용하는 방법
		Set<String> keys = hmap.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()){
			String key = iter.next();
			System.out.println(key + " : " + hmap.get(key));
		}
		
		// 2. values() 메소드를 사용하는 방법
		ArrayList<Book> list = new ArrayList<Book>(hmap.values());
		
		for(Book k : list){
			System.out.println(k);
		}
		
		// 3. entryset() 메소드를 사용하는 방법
		Set<Entry<String, Book>> entrySet = hmap.entrySet();
		
		Iterator<Entry<String, Book>> eIter = entrySet.iterator();
		
		while(eIter.hasNext()){
			Map.Entry<String, Book> entry = eIter.next();
			String key = entry.getKey();
			Book value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
