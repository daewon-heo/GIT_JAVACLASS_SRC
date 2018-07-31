package com.class_13_IO.com.kh.io.subStream.byteToCahrStream.run;

import com.class_13_IO.com.kh.io.subStream.byteToCahrStream.model.dao.TestByteToCharStream;

public class Main {

	public static void main(String[] args) {
		// 바이트-문자 변환 보조 스트림 실행 메소드
		TestByteToCharStream tbc 
			= new TestByteToCharStream();
		
//		tbc.fileSave();
		tbc.fileOpen();
	}

}
