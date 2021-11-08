package com.technoelevate.collectionassiginmnets;

import java.util.Iterator;

public class MyNewArrayListTesMethod {
	public static void main(String[] args) {
		MyNewArrayList arrayList = new MyNewArrayList(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add("avi");
		arrayList.add(56);

		System.out.println(arrayList.getIndex(9));
		System.out.println("================");

		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}






