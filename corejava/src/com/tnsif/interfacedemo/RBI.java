package com.tnsif.interfacedemo;

public class RBI implements Bank {

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 9.7f;
	}
public static void main(String[] args) {
	Bank b=new RBI();
	System.out.println("get rate of interest "+b.rateofinterest());
	
}
}

