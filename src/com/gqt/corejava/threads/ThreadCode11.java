package com.gqt.corejava.threads;
class producer extends Thread{
	Queue a;
	public producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.produce(i++);
		}
	}
}
class consumer extends Thread{
	Queue b;
	public consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue{
	int x;
	public void produce(int i) {
		x=i;
		System.out.println("producer has produced the data :"+x);
	}
	public void consume() {
		System.out.println("consumer has produced the data :"+x);
	}
		
	}
public class ThreadCode11 {

	public static void main(String[] args) {
		Queue q = new Queue();
		(new producer(q)).start();//producer p = new producer();p.start();
		(new consumer(q)).start();//consumer c = new consumer();c.start();
	}

}
