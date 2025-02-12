package com.celcom.day7;

class MyThread1 implements Runnable {
	
	public void run(){
		for(int i=0; i<=5; i++) {
			System.out.println("My thread is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread1());
		System.out.println(t1.getState()); //NEW STATE
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start(); // Running or Starting the thread
		
		Thread.sleep(3000);
		
		System.out.println("MAIN END");
		
		t1.suspend();
		System.out.println(t1.getState());
		t1.resume();
	}

}
