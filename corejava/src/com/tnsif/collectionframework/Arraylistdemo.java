package com.tnsif.collectionframework;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(8);
		a1.add(8);
		a1.add(9);
		a1.add(7);
		
		System.out.println(" size "+a1.size());
		System.out.println(a1);
		
		// check the elements
		
		System.out.println(a1.contains(2));
		
		// check the list is empty or not
		System.out.println(a1.isEmpty());
		
		// remove the element
		
		System.out.println(a1.remove(0));
		System.out.println(a1);
	}


	}

