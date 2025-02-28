package com.tnsif.superkeyword;

public class Childdemo extends Parentdemo{
	int a=7;
	void drink() {
		System.out.println("boost");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Childdemo d=new Childdemo();
		Parentdemo p=new Parentdemo();
		d.drink();
		p.drink();

	}

}
