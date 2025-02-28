package com.tnsif.interfacedemo;

import com.tnsif.interfacedemo.Myinterface.Myinnerinterface;

public class Demo {

	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Myinnerinterface.id);
		System.out.println(Nestedinterface.id);

	}

}
