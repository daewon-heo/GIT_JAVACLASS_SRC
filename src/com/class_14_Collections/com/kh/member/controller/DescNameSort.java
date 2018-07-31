package com.class_14_Collections.com.kh.member.controller;

import java.util.Comparator;

import com.class_14_Collections.com.kh.member.model.vo.Member;

public class DescNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member m1 = (Member)o1;
		Member m2 = (Member)o2;
		
		return m2.getName().compareToIgnoreCase(m1.getName());
	}

}
