package com.class_13_IO.com.kh.io.charStream.run;

import com.class_13_IO.com.kh.io.charStream.model.dao.TestCharStream;

public class Main {
	public static void main(String[] args) {
		// 문자 기반 데이터 입출력 테스트 메소드
		TestCharStream tc = new TestCharStream();
//		tc.fileOpen();
		tc.fileSave();
	}
}
