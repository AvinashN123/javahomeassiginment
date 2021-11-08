package com.technoelevate.collectionvectorstack;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push("ramesh");
		stack.push("Avi");
		stack.push("rama");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.push("Avi");
		System.out.println(stack);
		
	}

}
