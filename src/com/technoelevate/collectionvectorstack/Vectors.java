package com.technoelevate.collectionvectorstack;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {

		Vector vector = new Vector(4);
		vector.addElement("Avi");
		vector.addElement("Rama");
		vector.addElement("suri");
		vector.addElement("biri");

		System.out.println("Capcity" + vector.capacity());
		System.out.println("size" + vector.size());

		for (Object object : vector) {

			System.out.println(object);
		}

	}

}
