package com.class_14_Collections.com.kh.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	// Map :
	// 데이터 (자료)를 저장할 때
	// 각각의 자료들을 구분짓는 고유의 값을
	// 정하여 해당 값으로 접근하는 실제 객체를
	// 구분지으려고 할 때 사용하는 자료구조
	// 해당 객체를 저장할 때 Key와 Value로
	// 나누어서 Key는 Set의 특성으로,
	// Value는 List의 특성으로 관리한다.
	// 많이 사용하는 클래스는
	// HashMap, ThreeMap,
	// Properties가 있다.
	public static void main(String[] args) {
		// HashMap 테스트

		HashMap hmap = new HashMap();
		// Map hmap2 = new HashMap();

		// map에 값을 저장할 때에는
		// put() 메소드를 사용하는데,
		// 키(key)와 값(value) 두가지 객체를 모두
		// 저장해야 한다.

		hmap.put("one", new Date());
		hmap.put("two", "안녕하세요");
		hmap.put("three", 12345); // 자동 박싱처리가 된다.
		// 박싱처리
		// (int) 12345 --> (Integer) 12345
		// 언박싱
		// (Integer) 12345 --> (int) 12345
		System.out.println("hmap : " + hmap);

		System.out.println("one : " + hmap.get("one"));
		System.out.println("three : " + hmap.get("three"));
		System.out.println("four : " + hmap.get("four"));

		// 저장된 객체를 한개씩 목록화하여 꺼내는 방법
		// 1.	keyset() 메소드를 활용하는 방법
		Set keys = hmap.keySet();

		Iterator iter = keys.iterator();

		System.out.println("===========================");
		while (iter.hasNext()) {
			Object obj = iter.next();

			System.out.println(hmap.get((obj)));
		}

		// 2.	values() 메소드를 활용하는 방법
		Collection values = hmap.values();

		Iterator iter2 = values.iterator();

		System.out.println("===========================");
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		//	3.	Map.Entry 객체를 활용하여
		//		Key와 Value 모두를 출력하는 방법
		Set entrySet = hmap.entrySet();
		Iterator iter3 = entrySet.iterator();
		
		while(iter3.hasNext()){
			// key와 value 모두를 가지고 있는 객체를 꺼내어 온다
			Map.Entry entry = (Map.Entry)iter3.next();
			
			// key와 value를 각각 분리한다.
			String key = (String) entry.getKey();
			Object value = entry.getValue();
			
			//	key와 value를 각각 항상곽인한다.
			System.out.println(key + " : " + value);
		}
	}
}
