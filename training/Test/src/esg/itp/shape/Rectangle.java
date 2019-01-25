package esg.itp.shape;

public class Rectangle implements Polygon{
	public float length;
	public float breadth;
	public float a = 0,b = 0;
	
	
	

	public Rectangle() {
		super();
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	

	@Override
	public void calcArea() {
		a = getBreadth()*getLength();
		
	}

	@Override
	public void calPeri() {
		b = (2*(getBreadth()+getLength()));
		
	}

	@Override
	public void display() {
		calcArea();
		calPeri();
		System.out.println("area of rectangle: "+a);
		System.out.println("perimeter of rectangle: "+b);
		
	}

}
