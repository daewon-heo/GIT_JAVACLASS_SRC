package com.class_13_IO.com.kh.io.subStream.objectStream.model.vo;

import java.io.Serializable;

//
//	MVC 패턴 : Model View Controller
//	Model : 데이터, 객체 선언 및 해당 데이터 저장, 읽기 등을
//			담당하는 클래스를 가진 패키지
//	VO(Value Object) : 실제 저장, 읽기에 쓰이는 객체
//		- DTO(Data Transfer Object)
//		- Domain Object, Bean, Entity
//
// 	DAO(Data Access Object) : VO를 저장하고, 읽고, 수정하는 
//								기능을 담당하는 클래스
//	
//	Service : 하나의 서비스에 대한 기능을 담당하는 클래스
//
//--------------------------------------------------------------
//
//	View : 사용자 화면을 담당하는 객체
//		- java : 메뉴 출력 메소드
//		- web : jsp / html
//
//--------------------------------------------------------------
//
// Controller : 사용자 화면과 Service 기능을 연결해주는 클래스
//		- java : Manager 클래스
//		- web : Servlet
//
public class Member implements Serializable{
	// 1. 모든 필드가 private이어야 한다.
	// 2. 직렬화 처리를 반드시 해야 한다.
	// 3. 기본 생성자와 Getter & Setter를 반드시 포함해야 한다.

	// 직렬화 목적
	// 객체를 다른 프로그램, 컴퓨터에 전달할 때
	// 여러 필드들을 한 줄로 구성하여 처리함으로써
	// 서로 다른 운영 컴퓨터 구조라도 해당 객체를 올바르게 인식할 수 있게 
	// 해주는 기술
	
	private String name;
	private int age;
	private String address;
	private String phone;
	
	// transient : 해당 필드는 직렬화 하지 않겠다 라는 예약어
	private/*transient*/ double height;
	private double weight;
	
	public Member(){}
	
	public Member(String name, int age, String phone, String address, double height, double weight){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + ", height="
				+ height + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
	
	
}
