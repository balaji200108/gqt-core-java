package com.gqt.corejava.InterfacePrograms;
import java.util.Scanner;
abstract class Shapes{
	double area;
	abstract void collect ();
	abstract void calculate ();
	void display() {
		System.out.println ("The area is:"+area);
	}
}
class Circle extends Shapes{
	private double r;
	private final double pi=3.147; 

	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		r=sc.nextDouble();
	}
	@Override
	void calculate() {
		area = pi*r*r;
	}
	
}

class Rectangle extends Shapes{
	private double l,b;
	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle: ");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of the Rectangle: ");
		b=sc.nextDouble();
	}
	@Override
	void calculate() {
		area = l*b;
	}
	
}

class Square extends Shapes{
	private double side;
	@Override
	void collect() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of the Square: ");
		side=sc.nextDouble();
		
	}
	@Override
	void calculate() {
		area = side*side;
	}
	
}

class Geometry{
	void hasShapes(Shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}
}

public class LaunchShape {
	public static void main(String[] args) {
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Square s= new Square();
		
		Geometry g = new Geometry();
		
		g.hasShapes(c);
		System.out.println("-----------------------");
		
		g.hasShapes(r);
		System.out.println("-----------------------");
		
		g.hasShapes(s);
		System.out.println("-----------------------");
	}
	
	
	

}
