package com.class_14_Collections.com.kh.list;

import java.awt.LinearGradientPaint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	// List : 
	//	자료구조 중 순서가 유지 되고, 
	//	중복이 허용되는 자료 구조 기법을 
	//	이야기 하며, 자바에서는
	//	ArrayList,v Vector, LinkedList 등이 있다.
	//	이 중 ArrayList와 Vector는 기능이 동일하나
	//	ArrayList에는 Thread Safe(동시 제어) 기능이
	//	없는 클래스 이다.
	
	public static void main(String[] args) {
		// ArrayList 테스트
		
		ArrayList alist = new ArrayList<>();
		
		// 다형성을 적용한다면...
//		List blist = new ArrayList();
//		Collection clise = new ArrayList();
		
		alist.add("사과");
		alist.add(12345);	// W자동으로 래퍼클래스로 박싱 처리된다.
		alist.add(true);	// (값 - > ㅡㅋ래스)
		alist.add(12.5);
		alist.add('A');
		
		// 1.순서가 유지된다.
		// 2.toString()이 재정의(Override) 되어 있다.
		System.out.println("alist : " + alist);
		
		// index(순번)를 기준으로
		// for문을 통해 반복할 수 있다.
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
			
		}
		
		// 중복이 허용된다.
		alist.add("사과");
		System.out.println("alist : " + alist);
		
		// 배열중간에 값을 쉽게 추가할수 있으며,
		// 추가할 때 해당 위치에 있던 값과 그뒤의 값들이
		// 한칸씩 뒤로 밀려난다.
		alist.add(2, "추가합니다");
		System.out.println("alist : " + alist);
		
		alist.remove(3);
		System.out.println("alist : " + alist);
		
		// 정렬 확인용 객체
		ArrayList<String> sortList = new ArrayList<String>();
		
		sortList.add("자동차");
		sortList.add("엘리베이터");
		sortList.add("안경");
		sortList.add("사과");
		sortList.add("카레라이스");
		
		System.out.println("sortList : " + sortList);
		
		// 오름차순 정렬
		Collections.sort(sortList);
		System.out.println(sortList);
		
		// 내림차순 정렬
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
