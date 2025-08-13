package com.gqt.corejava.Inheritence;

class Ani {
	void walk() {
		System.out.println("Animal walks");
	}
	void run() {
		System.out.println("Animal runs");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Tiger extends Ani {
	@Override
	void run() {
		System.out.println("Tiger runs very fast");
	}
	void eatMeat() {
		System.out.println("Tiger eats meat");
	}
}

class Goat extends Ani {
	@Override
	void run() {
		System.out.println("Goat runs at medium speed");
	}
	void eatLeaves() {
		System.out.println("Goat eats leaves");
	}
}

class Buffalo extends Ani {
	@Override
	void run() {
		System.out.println("Buffalo runs very slow");
	}
	void eatGrass() {
		System.out.println("Buffalo eats grass");
	}
}

public class Example3 {
	public static void main(String[] args) {
		Tiger ta = new Tiger();
		Goat ga = new Goat();
		Buffalo ba = new Buffalo();

		ta.walk();
		ta.run();
		ta.sleep();
		ta.eatMeat();
		System.out.println("------");

		ga.walk();
		ga.run();
		ga.sleep();
		ga.eatLeaves();

		System.out.println("------");

		ba.walk();
		ba.run();
		ba.sleep();
		ba.eatGrass();
	}
}


