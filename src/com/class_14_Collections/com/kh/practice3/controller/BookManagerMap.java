package com.class_14_Collections.com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.class_14_Collections.com.kh.practice3.Book;

public class BookManagerMap {
	// 책 정보 저장용 map 객체 생성하여
	// 책의 정보를 관리하는 클래스
	
	private Map bookMap;
	
	public BookManagerMap(){
		bookMap = new HashMap();
	}
	
	public BookManagerMap(HashMap bookMap){
		this.bookMap = bookMap;
	}
	
	public void putBook(Book book){
		// 맵에 객체를 저장할 때
		// 주의할 점은 저장할 객체르 확인할 수 있는
		// 고유의 키 값을 선택해야 한다는 것이다.
		bookMap.put(book.getbNo(), book);
	}
	
	public void removeBook(String key){
		// put과 다르게 객체 하나를 식별할 수 있는
		// key만 알고 있으면 해당 객체를 찾아갈 수 있기 때문에
		// remove 할 때에는 key값 만으로도 객체 삭제가 가능하다.
		bookMap.remove(key);
	}
	
	public String searchBook(String bTitle){
		// entrySet() 사용하기
		// 도서명이 일치하는 객체를 찾아서 해당 객체의
		// key값인 도서 번호를 반환한다.
		// 만약 도서 번호가 없으면(찾는 도서가 없다면)
		// null을 반환한다.
		String key = null;

		Set bookEntrySet = bookMap.entrySet();
		Iterator iter = bookEntrySet.iterator();
		
		while(iter.hasNext()){
			// Map.Entry :
			//	Map에 속한 내부 클래스로
			//	한 객체에 대한 Key와 Value를 한 쌍으로
			//	가지는 객체를 말한다.
			 Map.Entry entry = (Map.Entry)iter.next();
			 String keys = (String)entry.getKey();
			 Book bookValue = (Book)entry.getValue();
			 
			 if(bookValue.getTitle().equals(bTitle)){
				 key = keys;
//				 key = (String)entry.getKey();
				 break;
			 }
		}
		
		return key;
	}
	
	public void displayAll(){
		// 맵의 정보를 모두 출력하기
		// KeySet() 사용하기
		
		Iterator iter = bookMap.keySet().iterator();
		
		while(iter.hasNext()){
			String bNo = (String)iter.next();
			System.out.println(bookMap.get(bNo));
		}
	}
	
	public Book[] sortedBookMap(){
		// 책 제목 순으로 오름차순 정렬
		// 책 객체만 가지고 있으면 정렬이 가능하다.
		// map의 values() 메소드로 각 객체들을 
		// 처리할 수 있다.
		
		ArrayList list 
			= new ArrayList(bookMap.values());
		
		list.sort(new AscBookTilte());
		
		Book[] br = new Book[list.size()];
		list.toArray(br);
		
		return br;
	}
	
	public void printBookMap(Book[] br){
		// 매개변수로 받은 객체 배열을 출력
		for(Book bk : br){
			System.out.println(bk);
		}
	}
	
	public void printBook(String key){
		// 책 한권의 정보 출력하기
		System.out.println(bookMap.get(key));
	}
	
}
