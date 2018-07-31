package com.class_13_IO.com.kh.io.subStream.buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedStream {
	// 입력 혹은 출력에 대한 임시 저장공간을 만들어서
	// 데이터를 한번에 처리하는 보조 스트림 테스트 클래스
	// 입력 : BufferedInputStream / Reader
	// 출력 : BufferedOutputStream / Writer
	
	public void fileSave(){
		
		try(BufferedWriter bw = 
				new BufferedWriter(
						new FileWriter("sample3.dat"));)
		{
			bw.write("안녕하세요\n");
			bw.write("오늘 날씨가 많이 덥네요");
			
			// 현재까지 작성한 내용을 전부
			// 전송하여 처리 하고, 현재 버퍼를 비운다.
			bw.flush();
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fileRead(){
		try(BufferedReader br = 
				new BufferedReader(
						new FileReader("sample3.dat"));)
		{
			String tmp;
			
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
		
		}
	}
}
