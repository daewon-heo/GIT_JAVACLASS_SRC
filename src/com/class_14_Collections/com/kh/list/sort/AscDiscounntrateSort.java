package com.class_14_Collections.com.kh.list.sort;

import java.util.Comparator;

public class AscDiscounntrateSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		return (int)(p1.getDiscounntrate() - p2.getDiscounntrate());
	}

}
