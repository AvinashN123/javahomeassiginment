package com.technoelevate.abstraction.assiginment;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactoryClass class1 = new FactoryClass();
		System.out.println("select the Person from the user from the option  ");
		System.out.println("1.Avi\n2.Pransu\n3.Nithin\n.4.Siddu");
		System.out.println(" please enter the your selection/choice");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			class1.getPerson("Avi").typeOfPerson();
			break;
		case 2:

			class1.getPerson("Pransu").typeOfPerson();
			break;

		case 3:
			class1.getPerson("Nithin").typeOfPerson();
			break;
		case 4:
			class1.getPerson("Siddu").typeOfPerson();

		default:
			System.out.println(" invalid");

		}

	}

}
