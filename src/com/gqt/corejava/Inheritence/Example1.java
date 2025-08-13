package com.gqt.corejava.Inheritence;
class Animal{
	public Animal() {
		super();
		System.out.println("Animal zero Parameterized Constructor is invoked");
}
	public Animal(String message) {
		super();
		System.out.println("Animal Parameterized Constructor is invoked");
		System.out.println("the animal consrtuctor has recived the message as :"+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello From Elephant");
		System.out.println("hi from elephant constructor");
	}
	public Elephant (String name,double weight) {
		super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Elephant e = new Elephant();
		System.out.println("--------------");
		Elephant e1 = new Elephant("Arjuna",5600);

	}

}
