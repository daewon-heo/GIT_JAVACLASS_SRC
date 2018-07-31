package com.class_14_Collections.com.kh.list.sort;

public class Product {
	private String name;
	private int price;
	private double discounntrate;
	
	public  Product(){
		
	}

	public Product(String name, int price, double discounntrate) {
		this.name = name;
		this.price = price;
		this.discounntrate = discounntrate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscounntrate() {
		return discounntrate;
	}

	public void setDiscounntrate(double discounntrate) {
		this.discounntrate = discounntrate;
	}
	
	@Override
	public String toString() {
		return name + ", " + price + ", " + discounntrate;
	}
	
	
}
