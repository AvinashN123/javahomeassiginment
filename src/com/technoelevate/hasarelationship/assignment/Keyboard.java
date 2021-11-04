package com.technoelevate.hasarelationship.assignment;

public class Keyboard {

	String name;
	int keys;
	double cost;

	public Keyboard(String name, int keys, double cost) {
		super();
		this.name = name;
		this.keys = keys;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Keyboard [name=" + name + ", keys=" + keys + ", cost=" + cost + "]";
	}

}
