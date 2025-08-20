package com.gqt.corejava.InterfacePrograms;
class Brain{
	double weight;
	float iq;
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public float getIq() {
		return iq;
	}
}
class Heart{
	double size;
	int valves;
	public Heart(double size, int valves) {
		super();
		this.size = size;
		this.valves = valves;
	}
	public double getSize() {
		return size;
	}
	public int getValves() {
		return valves;
	}
}
class Human{
	Brain b=new Brain(30,75.2f);
	Heart h=new Heart(40,4);
}
class Book{
	String name;
	double cost;
	public Book(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
}
class Mobile1{
	String company;
	String model;
	public Mobile1(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
}
class Student extends Human{
	Human hu= new Human();
	void hasBook(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getCost());
	}
	void hasMobile1(Mobile1 mb) {
		System.out.println(mb.getCompany());
		System.out.println(mb.getModel());
}
}
public class LunchStudent {

	public static void main(String[] args) {
	Student s = new Student();
	Book bk = new Book("melanophine",190);
	Mobile1 mb = new Mobile1("Samsung","S21Fe");
	System.out.println(s.b.getWeight());
	System.out.println(s.b.getIq());
	System.out.println("---------");
	System.out.println(s.h.getSize());
	System.out.println(s.h.getValves());
	System.out.println("---------");
	s.hasBook(bk);
	s.hasMobile1(mb);
	
	}
}
