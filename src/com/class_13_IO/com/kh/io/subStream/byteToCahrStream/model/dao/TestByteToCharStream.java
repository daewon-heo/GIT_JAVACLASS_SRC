package com.class_13_IO.com.kh.io.subStream.byteToCahrStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteToCharStream {
	// 바이트스트림을 문자 스트림으로 바꿔 주는
	// 보조 스트림 테스트 클래스
	// 입력 : InputStreamReader
	// 출력 : OutputStreamWriter
	
	public void fileSave(){
		
		try(OutputStreamWriter ow = 
				new OutputStreamWriter(
						new FileOutputStream("sample2.dat"));)
		{
			ow.write("Hello!");
			ow.write(12345);
			ow.write("안녕하세요");
			
			System.out.println("파일 저장 완료!!");
			
		}catch (IOException e) {
			System.out.println("파일 저장 중 문제가 발생했습니다.");
		}
	}
	
	public void fileOpen(){
		try(InputStreamReader ir = 
				new InputStreamReader(
						new FileInputStream("sample2.dat"));
		){
			int value;
			while((value = ir.read()) != -1){
				System.out.println((char)value + " ");
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("지정한 파일이 없습니다.");
		}catch (IOException e) {
			System.out.println("파일을 불러오는 중 에러가 발생했습니다.");
		}
	}
}
