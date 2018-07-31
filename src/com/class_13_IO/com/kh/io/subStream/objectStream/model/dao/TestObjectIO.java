package com.class_13_IO.com.kh.io.subStream.objectStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.class_13_IO.com.kh.io.subStream.objectStream.model.vo.Member;

public class TestObjectIO {
	
	public void fileSave(){
		Member[] mArr = {
					new Member("홍길동", 10 , "서울", "010", 120.0, 90.0),
					new Member("김길동", 20 , "강원", "011", 100.0, 110.0),
					new Member("박길동", 30 , "경남", "012", 150.0, 180.0),
			};
		
		try(ObjectOutputStream oOut = 
				new ObjectOutputStream(
						new FileOutputStream("member.dat"));){

			for(int i = 0 ; i < mArr.length; i++){
				oOut.writeObject(mArr[i]);
			}
			
			oOut.flush();
			
			System.out.println("객체 저장이 완료되었습니다.");
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void fileOpen(){
		Member[] mArr = new Member[3];
		
		try(ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("member.dat"));)
		{
			for(int i = 0 ; i < mArr.length; i++){
				mArr[i] = (Member)oin.readObject();
			}
			
			for(Member m : mArr){
				System.out.println(m.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
