package com.class_13_IO.com.kh.io.byteStream.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	// 특정 데이터를 바이트(Byte)단위로 읽고 쓸 수 있는
	// 바이트 입출력 객체 테스트 클래스
	// 입력 : InputStream
	// 출력 : OutputStream

	public void fileOpen() {
		// 특정 파일로부터 데이터를 Byte단위로 읽어오는 스트림
		FileInputStream fin = null;

		try {
			// 만약 읽어오려는 파일이 없으면
			// FileNotFoundDexception이 발생한다.
			// 따라서 해당 예외를 반드시 처리해야 한다.
			// fin = new
			fin = new FileInputStream("test.dat");

			// 파일 사이즈 확인하기
			int fileSize = (int) new File("test.dat").length();

			System.out.println("fileSize : " + fileSize);

			byte[] readData = new byte[fileSize];

			// 해당 파일의 정보를 읽어온다.
			// IOException이 발생하기 때문에 catch 구문에
			// 추가하여 사용하여야 한다.
			// fin.read(readData);

			// for(int i = 0 ; i < fileSize; i++){
			//
			// // 유니코드 기반으로 읽히며
			// // 해당하는 데이터가 바이트 자료형으로 변환되면서
			// // 오버 플로우가 발생한다.
			// System.out.print(readData[i] + " ");
			//
			// System.out.print((char)readData[i] + " ");
			// }

			int value;

			// 일반적으로 프로그램이 파일의 끝을 확인할 때
			// 마지막까지 데이터를 읽고 그 이후 데이터가 없다면
			// -1을 반환하는데 그 값을 파일의 끝으로 사용할 수 있다.
			while ((value = fin.read()) != -1) {
				System.out.print(value + " ");

				System.out.println();

				System.out.print((char) value + " ");
			}

			// 한글 데이터는 바이트 스트림으로 읽어 올 때
			// 글자가 깨지는 것을 확인할 수 있고,
			// 그 뜻은 바이트 스트림이 1byte씩 읽기 때문에
			// 2byte인 한글은 읽지 못한다는 것을 알 수 있다.
			//
			// 따라서, 바이트 스트림을 통해 변경된 한글을
			// 다시 한글 문자로 되둘릴 수 없다.

		} catch (FileNotFoundException e) {
			System.out.println("test.dat 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 에러가 발생했습니다.");
		} finally {
			// 사용한 입력 자원을 반납하기 위해
			// close()메소드로 받아준다.
			try {
				fin.close();
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}

	public void fileOpen2() {
		// try with resource를 사용하는 경우
		try (FileInputStream fin = new FileInputStream("test.dat");) {

			int fileSize = (int) new File("test.dat").length();

			byte[] readData = new byte[fileSize];

			fin.read(readData);

			for (int i = 0; i < fileSize; i++) {
				System.out.println(readData[i] + " ");
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 에러가 발생했습니다");
		}
	}

	public void fileSave() {
		// 특정 내욜을 작성하여
		// 파일로 해당 내욜을 출력하고(저장하고)
		// 결과를 확인하기 위한 메소드

		FileOutputStream fout = null;

		try {
			// 만약 파일이 없을 경우 새로운 파일로 만들어 저장하고
			// 파일이 이미 존재할 경우 덮어쓰기를 통해 파일을 저장한다.
			// fout = new FileOutputStream("test.dat");

			// 매개 변수로 true값을 주면 덮어쓰기가 아닌 이어쓰기로 동작한다.
			fout = new FileOutputStream("test.dat", true);

			fout.write(97);

			byte[] writeData = { 10, 20, 30, 40, 50 };

			fout.write(writeData);

			fout.write(writeData, 1, 3);

		} catch (IOException e) {

		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void fileSave2() {
		try (FileOutputStream fout = new FileOutputStream("test.dat", true);) {

			fout.write(97);
			byte[] writeData = { 97, 100, 104, 108, 120 };

			fout.write(writeData);

			fout.write(writeData, 1, 3);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
