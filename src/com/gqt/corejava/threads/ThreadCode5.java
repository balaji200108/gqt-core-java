package com.gqt.corejava.threads;
class MicrosoftWord extends Thread{
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
			for (int i=1;i<=5;i++) {
				System.out.println("Typing in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void ckecking() {
		try {
			for (int i=1;i<=5;i++) {
				System.out.println("Checking in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void saving() {
		try {
			for (int i=1;i<=5;i++) {
				System.out.println("Saving in progress....");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
public class ThreadCode5 {

	public static void main(String[] args) {
		MicrosoftWord ms1 = new MicrosoftWord();
		ms1.setName("typing");
		MicrosoftWord ms2 = new MicrosoftWord();
		ms2.setName("checking");
		MicrosoftWord ms3 = new MicrosoftWord();
		ms3.setName("saving");
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		System.out.println("------------");
		ms1.start();
		ms2.start();
		ms3.start();
		
	}

}
