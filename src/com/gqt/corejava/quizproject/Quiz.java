package com.gqt.corejava.quizproject;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ques[] = {
				"\u001B[34mWhich language is used for Android app development?\u001B[0m",
				"\u001B[34mWhat is the time complexity of binary search?\u001B[0m",
				"\u001B[34mWho discovered the theory of general relativity?\u001B[0m",
				"\u001B[34mWhich keyword is used to inherit a class in Java?\u001B[0m",
				"\u001B[34mWhat is the capital of Australia?\u001B[0m",
				"\u001B[34mWhich method is used to start a thread in Java?\u001B[0m",
				"\u001B[34mWhich HTML tag is used to create a hyperlink?\u001B[0m",
				"\u001B[34mWho is known as the father of computers?\u001B[0m",
				"\u001B[34mWhat is the output of 2 + 3 * 4 in Java?\u001B[0m",
				"\u001B[34mWhich data structure uses FIFO (First In First Out)?\u001B[0m"
		};

		String optio[] = {
				"\u001B[33mA.Java   B.Python   C.Swift   D.Kotlin\u001B[0m",
				"\u001B[33mA.O(n)   B.O(log n)   C.O(n log n)   D.O(1)\u001B[0m",
				"\u001B[33mA.Newton   B.Tesla   C.Einstein   D.Bohr\u001B[0m",
				"\u001B[33mA.implements   B.extends   C.super   D.import\u001B[0m",
				"\u001B[33mA.Sydney   B.Melbourne   C.Canberra   D.Perth\u001B[0m",
				"\u001B[33mA.run()   B.start()   C.begin()   D.execute()\u001B[0m",
				"\u001B[33mA.<div>   B.<a>   C.<p>   D.<link>\u001B[0m",
				"\u001B[33mA.Thomas Edison   B.Charles Babbage   C.Alan Turing   D.Dennis Ritchie\u001B[0m",
				"\u001B[33mA.20   B.14   C.10   D.17\u001B[0m",
				"\u001B[33mA.Stack   B.Queue   C.Tree   D.Graph\u001B[0m"
		};

		String options5050[] = {
				"\u001B[33mA.Java   D.Kotlin\u001B[0m",
				"\u001B[33mA.O(n)   B.O(log n)\u001B[0m",
				"\u001B[33mB.Tesla   C.Einstein\u001B[0m",
				"\u001B[33mA.implements   B.extends\u001B[0m",
				"\u001B[33mB.Melbourne   C.Canberra\u001B[0m",
				"\u001B[33mA.run()   B.start()\u001B[0m",
				"\u001B[33mB.<a>   D.<link>\u001B[0m",
				"\u001B[33mB.Charles Babbage   C.Alan Turing\u001B[0m",
				"\u001B[33mB.14   C.10\u001B[0m",
				"\u001B[33mA.Stack   B.Queue\u001B[0m"
		};

		String correoptions[] = {
				"D", // Kotlin
				"B", // O(log n)
				"C", // Einstein
				"B", // extends
				"C", // Canberra
				"B", // start()
				"B", // <a>
				"B", // Charles Babbage
				"B", // 14
				"B"  // Queue
		};
		int n = ques.length;
		System.out.println("Lets start the quiz...");
		System.out.println("\u001B[33mHere are the rules you have to know..\n"
				+ "1. If you know the answer, you can directly answer the question.\n"
				+ "2. If you don't know the answer, you can use lifelines, but lifelines should be used at any question only once.\n"
				+ "3. If you don't know the answer or if you don't have lifelines, then you can quit the quiz...\u001B[0m");
		System.out.println("Enter the Name to Start : ");
		String name =sc.nextLine();
		boolean AP=false;
		boolean FF=false;
		int moneyown=0;
		int mu5=0;
		int mu7=0;
		for(int i=0;i<n;i++) {
			System.out.println("Question - "+(i+1));
			System.out.println(ques[i]);
			System.out.println("Select one option among 4 options...");
			System.out.println(optio[i]);
			boolean answered=false;
			while(!answered) {
				System.out.println("\u001B[36m\nChoose an option :\u001B[0m");
				System.out.println("\u001B[36m1. If u know answer then answer the question\u001B[0m");
				if (!AP || !FF) {
					System.out.println("\u001B[36m2. If u don't know answer you can Use a lifeline\u001B[0m");
				}
				System.out.println("\u001B[36m3. Or else u can Quit the game\u001B[0m");
				System.out.println("\u001B[36mChoose option: \u001B[0m");
				int o1=sc.nextInt();
				sc.nextLine();

				if(o1==1) {
					System.out.print("Select the option A/B/C/D: ");
					String ans=sc.next();
					if (ans.equalsIgnoreCase(correoptions[i])) {
						System.out.println("\u001B[32mCongartulations...Correct Answer..!\n\u001B[0m"); 
						if(i<=4) {
							moneyown+=10000;
							if(i==4) {
								mu5=moneyown;
							}
						} else if(i<=6){
							moneyown+=10000;
							if(i==6) {
								mu7=moneyown;
							}
						}else {
							moneyown+=10000;
						}
						System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);
					} else {
						System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\n\u001B[0m"); 
						if (i <= 4) {
							moneyown = 0;
						} else if (i <= 6) {
							moneyown = mu5;
						} else {
							moneyown = mu7;
						}
						System.out.println("\u001B[35m"+name+" Money you take home: rs." + moneyown + "\u001B[0m");
						return;

					}
					answered=true;
				} else if(o1==2) {
					if (AP && FF) {
						System.out.println(" No lifelines left.");
					} else {
						System.out.println("\nAvailable Lifelines:");
						if (!AP) {
							System.out.println("1.  Audience phone");
						}
						if (!FF) {
							System.out.println("2.  50-50");
						}

						System.out.print("Choose a lifeline: ");
						int lifeline = sc.nextInt();
						sc.nextLine();

						if (lifeline == 1 && !AP) {
							System.out.println("Audience phone activated..");
							System.out.print(" Your friend suggests: " );
							String fso=sc.next();
							if (fso.equalsIgnoreCase(correoptions[i])) {
								System.out.println("\u001B[32mCongartulations...Correct Answer..!\n\u001B[0m"); 
								if(i<=4) {
									moneyown+=10000;
									if(i==4) {
										mu5=moneyown;
									}
								} else if(i<=6){
									moneyown+=10000;
									if(i==6) {
										mu7=moneyown;
									}
								}else {
									moneyown+=10000;
								}
								System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);

							} else {
								System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\n\u001B[0m"); 
								if (i <= 4) {
									moneyown = 0;
								} else if (i <= 6) {
									moneyown = mu5;
								} else {
									moneyown = mu7;
								}
								System.out.println("\u001B[35m"+name+" Money you take home: rs." + moneyown + "\u001B[0m");
								return;
							}
							answered=true;
							AP = true;
						} else if (lifeline == 2 && !FF) {
							System.out.println(" 50-50 activated..");
							System.out.println("Remaining options: " + options5050[i]);
							System.out.print("Select the option: ");
							String ff=sc.next();
							if (ff.equalsIgnoreCase(correoptions[i])) {
								System.out.println("\u001B[32mCongartulations...Correct Answer..!\n\u001B[0m"); 
								if(i<=4) {
									moneyown+=10000;
									if(i==4) {
										mu5=moneyown;
									}
								} else if(i<=6){
									moneyown+=10000;
									if(i==6) {
										mu7=moneyown;
									}
								}else {
									moneyown+=10000;
								}
								System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);

							} else {
								System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\n\u001B[0m"); 
								if (i <= 4) {
									moneyown = 0;
								} else if (i <= 6) {
									moneyown = mu5;
								} else {
									moneyown = mu7;
								}
								System.out.println("\u001B[35m"+name+" Money you take home: rs." + moneyown + "\u001B[0m");
								return;
							}
							answered=true;
							FF = true;
						} else {
							System.out.println(" Lifeline already used...");
						}
					}
				}else if (o1 == 3) {
					System.out.println("\nYou choose to quit.....");
					System.out.println("\n\u001B[35mMoney you take home: rs." + moneyown + "\u001B[0m");
					return;
				} else {
					System.out.println("Invalid input. Try again.");
				}
			}

		}
		System.out.println("\u001B[35mMoney you take home: rs." + moneyown + "\u001B[0m");
		sc.close();
	}

}

