package com.class_13_IO.com.kh.io.subStream.objectStream.run;

import com.class_13_IO.com.kh.io.subStream.objectStream.model.dao.TestObjectIO;

public class Main {

	public static void main(String[] args) {
		// 객체 입출력 테스트용 실행 메소드
		TestObjectIO tio = new TestObjectIO();
//		tio.fileSave();
		tio.fileOpen();
	}
}
