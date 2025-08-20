package com.gqt.corejava.InterfacePrograms;
class OS{
	String version_name;
	double version_number;
	public OS(String version_name,double version_number) {
		super();
		this.version_name = version_name;
		this.version_number = version_number;
	}
	public String getversion_name() {
		return version_name;
	}
		public double getversion_number() {
			return version_number;
	}
}
class Charger{
	String company;
	double voltage;
	public Charger(String company,double voltage) {
		super();
		this.company = company;
		this.voltage= voltage;
	}
	public String getcompany() {
		return company;
	}
		public double getvoltage() {
			return voltage;
	}
}class Mobile{
	OS os = new OS("windows",12.7);
	void hasCharger(Charger c) {
		System.out.println(c.getcompany());
		System.out.println(c.getvoltage());
	}
}
public class LunchMbile {

	public static void main(String[] args) {
		Charger c= new Charger("HP",5.5);
		Mobile m = new Mobile();
		System.out.println(m.os.getversion_number());
		System.out.println(m.os.getversion_name());
		m.hasCharger(c);
		
		//System.out.println(m.os.getversion_number());
		//System.out.println(m.os.getversion_name());
		System.out.println(c.getcompany());
		System.out.println(c.getvoltage());
	}

}
