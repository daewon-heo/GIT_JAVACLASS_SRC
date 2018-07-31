package com.class_14_Collections.com.kh.map;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class TestProperties {
	//	Properties : 
	//		어떠한 프로그램을 실행할 때
	//		함께 읽어오는 설정들(언어 설정, 화면 사이즈, 등)
	//		저장하는 파일
	//		최근에는 XML 방식으로 대체 되었으나
	//		아직 많은 응용프로그램들이 이 파일을 설정 파일로써
	//		사용하고 있다.
	//		Properties는 Key와 Value로 이루어진 Map 형식을
	//		가지고 있으나 Key와 value 모두 문자열 형태로 
	//		저장하여 사용한다.
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		// 값을 저장할 때에는 setProperty() 메소드를 사용
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
		prop.setProperty("username", "student");
		prop.setProperty("password", "student");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
