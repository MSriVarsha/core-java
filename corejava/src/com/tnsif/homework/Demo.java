package com.tnsif.homework;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a= sc.nextInt();
		sc.close();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
	}
}
}