package com.tnsif.abstractdemo;

import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a= sc.nextInt();
		int b;
		int sum=0;
		
		while(a>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	}
}