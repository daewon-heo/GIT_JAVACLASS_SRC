package com.class_14_Collections.com.kh.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties2 {
	public static void main(String[] args) {
		// properties로 저장한 설정을 읽어오는 방법
		
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("driver.dat"));
//			prop.load(new FileReader("driver.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
