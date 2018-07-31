package com.class_14_Collections.com.kh.list.sort;

import java.util.Comparator;

public class AscNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// Product 하나하나를 비교하기 위해
		// 각 객체를 가져온 뒤 해당 객체의
		// name 값을 비교하여 정렬하는 메소드 구현하기
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		return p1.getName().compareToIgnoreCase(p2.getName());
	}

}
