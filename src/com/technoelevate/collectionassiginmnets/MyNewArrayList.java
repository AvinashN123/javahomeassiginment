package com.technoelevate.collectionassiginmnets;

import java.util.Iterator;




public class  MyNewArrayList implements Iterable {
	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		String string = "[" + array[0];
		for (int i = 0; i < size(); i++) {
			string += "," + array[i];
		}
		string = "]";
		return string;
	}

	private int postion;
	private Object[] array;

	public MyNewArrayList(int arraysize) {
		array = new Object[arraysize];

	}

	public void add(Object obj) {
		if (postion >= size()) {
			grow();
		}
		array[postion++] = obj;
	}

	public Object getIndex(int index) {

		return array[index];

	}

	public int size() {
		return array.length;

	}

	public void grow() {
		Object[] temp = new Object[array.length + 10];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	@Override
	public Iterator iterator() {
		return new Itr();

	}

	public class Itr implements Iterator {
		int index;

		@Override
		public boolean hasNext() {

			return (index < postion) ? true : false;
		}

		@Override
		public Object next() {
              
			return array[index++];
		}

	}

}

