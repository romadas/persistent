package com.psl.Client;
import java.awt.font.ShapeGraphicAttribute;

import com.psl.Model.Circle;
import com.psl.Model.Cube;
import com.psl.Model.Rectangle;
import com.psl.Model.Shape2D;
import com.psl.Model.Shape3D;
import com.psl.Model.sphere;


public class Main {
	public static void main(String args[]){
		Circle c = new Circle(6.4);
		Rectangle r = new Rectangle(20.34,40.34);
		Cube cb = new Cube(78.7);
		sphere sp = new sphere(34.6);
		Shape2D s2 = r;
		shapeManager(s2);
		s2=c;
		
		shapeManager(s2);
		Shape3D s3=cb;
		shapeManager(s3);
		s3 = sp;
		shapeManager(s3);
	
		
	}
		public static void shapeManager(Shape2D s){
			s.calculateArea();
			s.calculatePerimeter();
			System.out.println(s.getName());
			System.out.println(s.getArea());
			System.out.println(s.getPerimeter());
		
	}
		public static void shapeManager(Shape3D s){
			
			s.calculateVolume();
			s.calculateSurface_area();
			System.out.println(s.getName());
			System.out.println(s.getVolume());
			System.out.println(s.getSurface_area());
			
	}
}


