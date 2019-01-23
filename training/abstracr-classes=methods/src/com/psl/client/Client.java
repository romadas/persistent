package com.psl.client;
import com.psl.model.Circle;
import com.psl.model.Rectangle;
import com.psl.model.Shape;
import com.psl.model.Triangle;

public class Client {
	public static void main(String args[]){
		Circle c = new Circle(6.4);
		Rectangle r = new Rectangle(45,57);
		Triangle t = new Triangle(57,48,43);
		
		shapeManager(c);
		shapeManager(r);
		shapeManager(t);
	}
		public static void shapeManager(Shape s){
			s.calculateArea();
			s.calculatePerimeter();
			System.out.println(s.getName());
			System.out.println(s.getArea());
			System.out.println(s.getPerimeter());
		
	}
}
