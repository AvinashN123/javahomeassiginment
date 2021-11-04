package com.technoelevate.hasarelationship.assignment;

public class MainMethod {
	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard("Logitech", 106, 3495);
		MicroProcessor microProcessor = new MicroProcessor(128, 25, "31-dec-2021");
		Computer computer = new Computer("dell", 75000, 50000, keyboard, microProcessor, 4);
		computer.Work();
		computer.computerInfo();

	}

}
