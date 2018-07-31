package com.class_13_IO.com.kh.io.fileobj;

import java.io.File;
import java.util.Scanner;

public class TestFileobj {

	public static void main(String[] args) {
		// java에서 제공하는 File객체
		// 실제 생성되는 파일과 관련된 기능을
		// 제공하기 위해 사용하는 자바 객체이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요  : ");
		String filename = sc.next();
		
		File file = new File(filename);
		
		System.out.println("파일이 존재하는지 확인하기");
		
		if(file.exists()){	// 파일이 존재한다면
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일이 존재하는 경로 : " + file.getPath());
			System.out.println("파일이 존재하는 경로 : " + file.getAbsolutePath());
			System.out.println("파일의 크기(byte) : " + file.length());
			
			
		}else{	// 그렇지 않다면
			System.out.println(filename + "이 존재하지 않습니다.");
		}
	}

}
