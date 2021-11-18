package com.technoelevate.sortingcasestudy;



public class Student {
	private String name;
	private int id;
	private int marks;
	private long mobNo;
	private char gender;
	private int age;

	public Student(String name, int id, int marks, long mobNo, char gender, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.mobNo = mobNo;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public long getMobNo() {
		return mobNo;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

}

