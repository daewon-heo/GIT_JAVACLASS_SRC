package com.class_13_IO.com.kh.io.subStream.buffered.run;

import com.class_13_IO.com.kh.io.subStream.buffered.model.dao.TestBufferedStream;

public class Main {

	public static void main(String[] args) {
		// 버퍼 보조 스트림을 사용한 기능 실행 메소드
		TestBufferedStream tbs = new TestBufferedStream();
//		tbs.fileSave();
		tbs.fileRead();
	}

}
