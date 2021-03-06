package com.class_14_Collections.com.kh.member.controller;

import java.util.Comparator;

import com.class_14_Collections.com.kh.member.model.vo.Member;

public class AscNameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Member m1 = (Member)o1;
		Member m2 = (Member)o2;

		return m1.getName().compareToIgnoreCase(m2.getName());
	}

}
