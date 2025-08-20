package com.gqt.corejava.Polymorphism;

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
				System.out.println("Goat runs briskly");
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
		class Zoo{
			void permit(Ani ref) {
				ref.walk();
				ref.run();
				ref.sleep();
				
			}
		}
		public class CondensedPolymorphism2 {

			public static void main(String[] args) {
				Tiger ta = new Tiger();
				Goat ga = new Goat();
				Buffalo ba = new Buffalo();
				Zoo za = new Zoo();

				za.permit(ta);
				ta.eatMeat();
				System.out.println("------");

				za.permit(ga);
				ga.eatLeaves();

				System.out.println("------");

				za.permit(ba);
				ba.eatGrass();

	}

}
