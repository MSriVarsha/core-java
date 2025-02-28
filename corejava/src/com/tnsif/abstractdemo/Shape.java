package com.tnsif.abstractdemo;

public abstract class Shape {
	
	protected float area;
	abstract void calarea();
	
	void show()
	{
		System.out.println("area of shape "+area);
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	

}
