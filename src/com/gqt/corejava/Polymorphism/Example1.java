package com.gqt.corejava.Polymorphism;
	
		class Plane{
			void takeOff() {
				System.out.println("Plane took off");
			}
			void fly() {
				System.out.println("Plane flys");
			}
			void land() {
				System.out.println("Plane lands");
			}
		}
		class CargoPlane extends Plane{
			@Override
			void fly() {
				System.out.println("CrgoPlane flys at low heights");
			}
			void carryGoods() {
				System.out.println("CargoPlane carry goods");
			}
		}
		class PassengerPlane extends Plane{
			@Override
			void fly() {
				System.out.println("PssengerPlane flys at medium heights");
			}
			void carryHumans() {
				System.out.println("PassengerPlane carry humans");
			}
		}
		class FighterPlane extends Plane{
			@Override
			void fly() {
				System.out.println("FighterPlane flys at hihgh heights");
			}
			void carryWeapons() {
				System.out.println("CargoPlane carry weapons");
			}
		}

		public class Example1 {

			public static void main(String[] args) {
				CargoPlane cp= new CargoPlane();
				PassengerPlane pp= new PassengerPlane();
				FighterPlane fp= new FighterPlane();
				Plane ref;
				ref = cp;
				ref.takeOff();
				ref.fly();
				ref.land();
				cp.carryGoods();
				System.out.println("--------");
				ref = pp;
				ref.takeOff();
				ref.fly();
				ref.land();
				pp.carryHumans();
				System.out.println("--------");
				ref=fp;
				ref.takeOff();
				ref.fly();
				ref.land();
				fp.carryWeapons();
				System.out.println("--------");
	}

}
