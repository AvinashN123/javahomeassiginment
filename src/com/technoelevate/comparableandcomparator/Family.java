package com.technoelevate.comparableandcomparator;

public class Family implements Comparable<Family> {
	
	int age;
	String name;
	String realation;
	public Family(int age, String name, String realation) {
		super();
		this.age = age;
		this.name = name;
		this.realation = realation;
	}
	@Override
	public int compareTo(Family o) {
		
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "Family [age=" + age + ", name=" + name + ", realation=" + realation + "]";
	}

}
