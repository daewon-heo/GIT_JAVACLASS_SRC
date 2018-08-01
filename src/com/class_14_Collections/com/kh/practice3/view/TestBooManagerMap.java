package com.class_14_Collections.com.kh.practice3.view;

import java.util.Scanner;

import com.class_14_Collections.com.kh.practice3.Book;
import com.class_14_Collections.com.kh.practice3.controller.BookManagerMap;

public class TestBooManagerMap {
	public static void menu(){
		BookManagerMap bm = new BookManagerMap();
		Scanner sc = new Scanner(System.in);
		bm.putBook(new Book("1", 1, "ABCDE", "test1"));
		bm.putBook(new Book("2", 2, "DDDDD", "test2"));
		bm.putBook(new Book("4", 2, "BBBBB", "test3"));
		bm.putBook(new Book("3", 3, "AAAAA", "test4"));
		do{
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel){
			case 1:
				bm.putBook(inputBook());
				break;
			case 2:
				bm.printBookMap(bm.sortedBookMap());
				break;
			case 3:
				bm.removeBook(bm.searchBook(inputBookTitle()));
				break;
			case 4:
				bm.printBook(bm.searchBook(inputBookTitle()));
				break;
			case 5:
				bm.displayAll();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 누르셨습니다.");
			}
		}while(true);
	}
	
	public static Book inputBook(){
		Scanner sc = new Scanner(System.in);
		Book bk = new Book();
		
		System.out.print("책 번호 : ");
		bk.setbNo(sc.next());
		
		System.out.print("카테고리 : ");
		bk.setCategory(sc.nextInt());
		
		System.out.print("제목 : ");
		bk.setTitle(sc.next());
		
		System.out.print("저자 : ");
		bk.setAuthor(sc.next());
		
		return bk;
	}
	
	public static String inputBookTitle(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책 제목 입력 : ");
		return sc.next();
	}
}
