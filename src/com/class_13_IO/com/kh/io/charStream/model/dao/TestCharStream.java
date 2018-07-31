package com.class_13_IO.com.kh.io.charStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	// 문자 기반 데이터 입출력 테스트 클래스
	// 입력 : Reader(읽다)
	// 출력 : Writer(쓰다)
	
	public void fileOpen(){
		try(FileReader fr = new FileReader("sample.txt")){
			
			int value;
			
			while((value = fr.read()) != -1){

				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileSave(){
		try(FileWriter fw = new FileWriter("sample.txt")){
			fw.write("배고파요");
			fw.write("I'm hungry");
			fw.write(12345);
			
			char[] chArr = {'A', 'P', 'P', 'L', 'E'};
			
			fw.write(chArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
