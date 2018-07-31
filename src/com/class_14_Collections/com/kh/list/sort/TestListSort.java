package com.class_14_Collections.com.kh.list.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class TestListSort {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("PAV", 20000, 2));
		list.add(new Product("TEST1", 500000, 10));
		list.add(new Product("APPLE", 300000, 9));

		System.out.println("list : " + list);

		System.out.println("\nlist 출력");
		for (Object prd : list) {
			System.out.println(prd);
		}

		// price 기준으로 오름차순,내림차순
		list.sort(new AscPriceSort());

		System.out.println("\nprice 오름차순 정렬 후");

		for (Object obj : list) {
			System.out.println(obj);
		}

		// product의 이름을 기준으로 오름차순
		list.sort(new AscNameSort());

		System.out.println("\nname 오름차순 정렬 후");

		for (Object obj : list) {
			System.out.println(obj);
		}

		// product의 이름을 기준으로 내림차순
		list.sort(new DescNameSort());

		System.out.println("\nname 내림차순 정렬 후");

		for (Object obj : list) {
			System.out.println(obj);
		}
		
		// product의 이름을 기준으로 오름차순
		list.sort(new AscDiscounntrateSort());

		System.out.println("\ndiscounntrate 오름차순 정렬 후");

		for (Object obj : list) {
			System.out.println(obj);
		}

		// product의 이름을 기준으로 내림차순
		list.sort(new DescDiscounntrateSort());

		System.out.println("\ndiscounntrate 내림차순 정렬 후");

		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
