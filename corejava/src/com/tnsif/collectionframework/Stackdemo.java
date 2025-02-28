package com.tnsif.collectionframework;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer> ();

		ob.push(22);
		ob.push(2);
		ob.push(7);
		ob.push(89);
		
		System.out.println("stack elementd"+ob);
		
		System.out.println(ob.peek());
		
		if(ob.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("not empty");
		}
		System.out.println(ob.search(67));
		
		System.out.println(ob.search(22));
	}

}
