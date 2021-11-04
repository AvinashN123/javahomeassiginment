package com.technoelevate.hasarelationship.assignment;

public class MicroProcessor {

	int Storage;
	int ram;
	String date;

	public MicroProcessor(int storage, int ram, String date) {
		super();
		Storage = storage;
		this.ram = ram;
		this.date = date;
	}

	@Override
	public String toString() {
		return "MicroProcessor [Storage=" + Storage + ", ram=" + ram + ", date=" + date + "]";
	}
}
