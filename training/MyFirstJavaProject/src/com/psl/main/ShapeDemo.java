package com.psl.main;

public class ShapeDemo {
	public int shapeManager(int l, int b){
		return (l * b);
	}
	public float shapeManager(float r){
		return(float) ( 3.14 * r * r);
	}
	public float shapeManager(float h,float l){
		return(float)(0.5*(h*l));
		
	}
	public static void main(String args[]){
		ShapeDemo obj = new ShapeDemo();
		System.out.println("area of rectangle"+ obj.shapeManager(10,20));
		System.out.println("area of circle " + obj.shapeManager(7));
		System.out.println("area of triangle"+obj.shapeManager(20, 78));
	}
}
