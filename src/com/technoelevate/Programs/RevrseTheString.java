package com.technoelevate.Programs;

public class RevrseTheString {
	public static void main(String[] args) {
		String st = "My name is Avinash";
		char[] ch = st.toCharArray();
		String str = " ";

		for (int i = ch.length - 1; i > 0; i--) {
			int k = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}

			int j = i + 1;
			while (j <= k) {
				str = str + ch[i];
				j++;
			}

			while (i > 0) {
				str = str + ch[i];
			}
		}

		System.out.println(str);

	}
}
