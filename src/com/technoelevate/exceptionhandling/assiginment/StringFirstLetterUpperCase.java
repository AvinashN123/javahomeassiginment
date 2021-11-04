package com.technoelevate.exceptionhandling.assiginment;

import java.util.Scanner;

public class StringFirstLetterUpperCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enterthe String");
		String str = scanner.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				} else if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
					if (ch[i] >= 'A' && ch[i] <= 'Z') {
						ch[i] = (char) (ch[i] + 32);
					}

				}

			}
		}
		
		str=new String(ch);
		System.out.println(str);

	}
}
