package com.gqt.corejava.threads;
class MicrosoftWord1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
	}
	else if (Thread.currentThread().getName().equals("checking")) {
		
		ckecking();
}
	else {
		saving();
	}
	}
	public void typing () {
		try {
			for (;;) {
				System.out.println("Typing in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	// secondary thread
	// making it loop
	private void ckecking() {
		try {
			for (;;) {
				System.out.println("Checking in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void saving() {
		// secondary thread
		// making it loop
		try {
			for (;;) {
				System.out.println("Saving in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
public class ThreadCode6 {
	public static void main(String[] args) {
		MicrosoftWord1 ms1 = new MicrosoftWord1();
		ms1.setName("typing");
		MicrosoftWord1 ms2 = new MicrosoftWord1();
		ms2.setName("checking");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		MicrosoftWord1 ms3 = new MicrosoftWord1();
		ms3.setName("saving");
		ms3.setPriority(9);
		ms3.setDaemon(true);
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		System.out.println("------------");
		ms1.start();
		ms2.start();
		ms3.start();
		
	}
}
