package com.technoelevate.collectionvectorstack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vectors2 {
public static void main(String[] args) {
	
	
	ArrayList arrayList=new ArrayList();
	arrayList.add("rama");
	arrayList.add("Avi");
	
	System.out.println(arrayList);
	
	Vector vector=new Vector(arrayList);
	
	System.out.println(vector);
	
	
	LinkedList linkedList=new LinkedList(arrayList);
	
	System.out.println(linkedList);
	
	
}
}
