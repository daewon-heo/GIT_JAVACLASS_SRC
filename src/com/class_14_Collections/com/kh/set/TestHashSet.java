package com.class_14_Collections.com.kh.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	// Set : 
	// 자료구조 유형 중 하나로
	// List와 대조되는 특성을 가지고 있다.
	// 먼저, set은 순서가 유지되지 않으며
	// 중복을 허용하지 않는다.
	// 따라서 set을 하나의 집합이라고 표현하기도 한다.
	// 이러한 set의 종류는 크게 HashSet과 TreeSet,
	// LinkedHashSet이 있다.
	
	public static void main(String[] args) {
		// HashSet 테스트
		HashSet hset = new HashSet();
		
		// 다형성 적용한 생성
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();
		
		hset.add("사과");
		hset.add(12345);
		hset.add(true);
		hset.add(12.5);
		hset.add('A');
		
		// 1. 저장 순서가 유지되지 않는다.
		// 2. toString이 재정의 되어 있다.
		System.out.println("hset : " + hset);
		
		hset.add("사과");
		hset.add("키위");
		hset.add("사과");
		hset.add("포도");
		
		// 3. 중복을 허용하지 않는다.
		System.out.println("hset : " + hset);
		System.out.println("저장 개수 : " + hset.size());
		System.out.println("포함 여부 확인 : " + hset.contains("사과"));
		
		System.out.println("---------------------------------");
		
		// 순서가 유지되지 않는 Set의 각 요소를
		// 차례대로 꺼내는 방법
		
		//	1.	set 객체를 배열로 만들어서 하나씩 
		//		꺼내는 방법
		
		Object[] oArr = hset.toArray();
		
		for(Object obj : oArr){
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------");
		//  2.	set 객체를 목록화(iterator)하여
		// 		하나씩 순서대로 꺼내는 방법.
		Iterator iter = 
				hset.iterator();
		
		// 다음에 꺼내올 요소가 있는가?
		while(iter.hasNext()){
			// 현재 요소를 꺼내어 오고 다음 요소로
			// 이동한다.
			Object obj = iter.next();
			System.out.println(obj);
		}
		
		// set 자체를 통으로 지우는 방법
		hset.clear();
		
		System.out.println("---------------------------------");
		
		System.out.println(hset);
		System.out.println("set이 비었나요 ? " + hset.isEmpty());
	}
}
