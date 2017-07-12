package com.pojo;

public class Person {
	private int age;
	private int adh_no;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAdh_no() {
		return adh_no;
	}
	public void setAdh_no(int adh_no) {
		this.adh_no = adh_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, int adh_no, String name) {
		super();
		this.age = age;
		this.adh_no = adh_no;
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
		name = "";
		age = adh_no = 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+adh_no;
	}
	

}
