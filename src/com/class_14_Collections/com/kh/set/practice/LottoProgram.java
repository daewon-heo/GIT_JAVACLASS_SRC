package com.class_14_Collections.com.kh.set.practice;

import java.util.TreeSet;

public class LottoProgram {
	public static void main(String[] args) {
		// 1 ~ 45 사이의 랜덤 값
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6){
			int rand = (int)(Math.random()*45) + 1;
			lotto.add(rand);
		}
		
		System.out.println("lotto : " + lotto);
	}
}
