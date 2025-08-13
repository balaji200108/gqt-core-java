package encapsulation;
class Cat {
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;

	// zero parameterized constructor
	public Cat () {
		super();
		System.out.println("Inside zero parameterised constructor");
		this.name = "Ramu";
		this.color = "brown";
		this.cost = 7000;
		this.age = 3;
		this.breed = "pomerian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	// one parameterized constructor
	public Cat(String name) {
		this();
		System.out.println("Inside one parameterised constructor");
		this.name =name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	//two parameterized constructor
	public Cat(String name,String color) {
		this("chintu");
		System.out.println("Inside two parameterised constructor");
		this.name =name;
		this.color =color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	//three parameterized constructor
	public Cat (String name,String color,int cost) {
		this("tommy","blue");
		System.out.println("Inside three parameterised constructor");
		this.name =name;
		this.color =color;
		this.cost =cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	//four parameterized constructor
	public Cat(String name,String color,int cost,int age) {
		this("dobby","orange",9000);
		System.out.println("Inside four parameterised constructor");
		this.name =name;
		this.color =color;
		this.cost =cost;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
	//five parameterized constructor
	public Cat(String name,String color,int cost,int age,String breed) {
		this("jimmy","purple",7500,7);
		System.out.println("Inside five parameterised constructor");
		this.name =name;
		this.color =color;
		this.cost =cost;
		this.age=age;
		this.breed = breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------");
	}
}
public class MainApp {

	public static void main(String[] args) {
		Cat dl= new Cat("Rocky","white",8000,8,"GR");

	}
}
