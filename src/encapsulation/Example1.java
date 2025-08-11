package encapsulation;
class lion{
	private String name;
	private String color;
	private String country;
	private int age;
	//setter method without parameters
	void setData1() {
		name="balaji";
		color="yellow";
		country="africa";
		age=8;
	}
	//setter method with parameters
	void setData2(String a,String b,String c,int d) {
		name=a;
		color=b;
		country=c;
		age=d;
	}
	//getter method for displaying data 
	void getData() {
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Country: "+country);
		System.out.println("Age: "+age);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion l1=new lion();
//		l1.name="reddy";//the class lion properties are private members in nature so we cannot access them out the class
		l1.setData1();
		l1.getData();
		System.out.println("--------------");
		l1.setData2("subbu", "white", "India", 17);
		l1.getData();
	}

}
