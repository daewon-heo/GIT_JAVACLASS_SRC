package com.class_14_Collections.com.kh.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric2 {
	public static void main(String[] args) {
			ArrayList<Book> list1 = new ArrayList<Book>();
			list1.add(new Book("1"));
			list1.add(new Book("2"));
			list1.add(new Book("3"));
			list1.add(new Book("4"));
			list1.add(new Book("5"));
			
			ArrayList<Car> list2 = new ArrayList<Car>();
			list2.add(new Car("car1"));
			list2.add(new Car("car2"));
			list2.add(new Car("car3"));
			list2.add(new Car("car4"));
			list2.add(new Car("car5"));
			
			TestGeneric2 tg2 = new TestGeneric2();
			tg2.printBook(list1);
			tg2.printCar(list2);
			
	}
	
	public void printBook(List<Book> list){
		for (Book bk : list) {
			System.out.println(bk);
		}
		
	}
	
	public void printCar(List<Car> list){
		for (Car car : list){
			System.out.println(car);
		}
	}
}
