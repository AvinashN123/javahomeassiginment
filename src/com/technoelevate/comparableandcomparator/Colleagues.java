package com.technoelevate.comparableandcomparator;

public class Colleagues implements Comparable<Colleagues> {
	int age;
	String name;
	 String relation;
	public Colleagues(int age, String name, String relation) {
		super();
		this.age = age;
		this.name = name;
		this.relation = relation;
	}
	@Override
	public int compareTo(Colleagues o) {
		
		return  this.relation.compareTo(o.relation);
	}
	@Override
	public String toString() {
		return "Colleagues [age=" + age + ", name=" + name + ", relation=" + relation + "]";
	}

}
