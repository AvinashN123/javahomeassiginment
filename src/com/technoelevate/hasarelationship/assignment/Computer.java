package com.technoelevate.hasarelationship.assignment;

public class Computer {

	String name;
	double cost;
	double battery;
	Keyboard keyboard;
	MicroProcessor microProcessor;
	int core;

	public Computer(String name, double cost, double battery, Keyboard keyboard, MicroProcessor microProcessor,
			int core) {
		super();
		this.name = name;
		this.cost = cost;
		this.battery = battery;
		this.keyboard = keyboard;
		this.microProcessor = microProcessor;
		this.core = core;
	}

	public void Work() {
		System.out.println("Computer is working");
	}

	public void computerInfo() {
		System.out.println(name + " " + cost + " " + battery + " " + keyboard + " " + microProcessor + " " + core);
	}

}
