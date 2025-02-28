package com.tnsif.multithreading;

class Eclipse extends Thread{
	public void run() {
		System.out.println("eclpise "+Thread.currentThread().getId());
	}
}
class Notepad extends Thread{
		public void run() {
			System.out.println("Notepad "+Thread.currentThread().getId());
}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome "+Thread.currentThread().getId());
	}
}
public class Maindemo {

	public static void main(String[] args) {
		  Eclipse e=new Eclipse();
		  e.start();
		  Notepad n=new Notepad();
		  n.start();
		  Chrome c=new Chrome();
		  c.start();

	}
}

