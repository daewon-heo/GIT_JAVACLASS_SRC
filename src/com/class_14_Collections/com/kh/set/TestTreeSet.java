package com.class_14_Collections.com.kh.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	// Tree 구조를 활용하여
	// 데이터를 저장함으로써
	// 자동으로 정렬까지 처리하는 set 클래스
	
	public static void main(String[] args) {
		// TreeSet 테스트
		TreeSet tset = new TreeSet();
//		Set tset2 = new TreeSet();
		
		tset.add("java");
		tset.add("oracle");	// 2개월
		tset.add("html");
		tset.add("css");	// 4개월
		
		//	1.	treeset은 데이터를 저장할 때
		//		자동으로 오름차순 정렬을 한다.
		System.out.println("test : " + tset);
		
		System.out.println("-------------iterator()------------");
		
		Iterator iter = tset.iterator();
		
		while(iter.hasNext()){
			Object obj = iter.next();
			String str = (String)obj;
			
			//	한개의 요소를 꺼내어
			//	대문자로 변경한 뒤에 화면에 출력하기
			System.out.println(str.toUpperCase());
		}
		
		System.out.println("-------------toArray()------------");
		//	2.	Object[] 배열로 만들어서 꺼내는 방법
		Object[] arr = tset.toArray();
		
		System.out.println("for---------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString().toUpperCase());
		}
		
		
		// foreach
		System.out.println("foreach---------");
		for(Object obj : arr){
			String str = (String)obj;
			System.out.println(str.toUpperCase());
		}
	}
}
