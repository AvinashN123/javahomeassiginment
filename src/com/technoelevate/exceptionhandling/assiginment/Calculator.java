package com.technoelevate.exceptionhandling.assiginment;

public class Calculator {

	public static void main(String[] args) {
		div(2, 1);
		multipication(5,6);
	}

	private static void multipication(int i, int j) {
		try {
		int reslut=i*j;
		System.out.println("reslut "+reslut);
			}catch (Exception e) {
		System.out.println("Provide the correct value");
	}
	}
	

	private static void div(int i, int j) {
		try {
			int reslut = i / j;
			System.out.println("Reslut " + reslut);
		} catch (Exception e) {
			System.out.println("Provide the correct value");

		}

	}

}
