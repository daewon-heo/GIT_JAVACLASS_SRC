package com.class_14_Collections.com.kh.practice3.controller;

import java.util.Comparator;

import com.class_14_Collections.com.kh.practice3.Book;

public class AscBookTilte implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// 현재 받은 객체가 원래 Book 객체 인지
		// 확인을 먼저 한 뒤에 비교를 해야한다.
		if(o1 instanceof Book && o2 instanceof Book) {
			Book bk1 = (Book)o1;
			Book bk2 = (Book)o2;
			
			if(bk1.getTitle().compareTo(bk2.getTitle()) > 0){
				result = 1;
			}else if(bk1.getTitle().compareTo(bk2.getTitle()) < 0){
				result = -1;
			}
		}
		
		return result;
	}

}
