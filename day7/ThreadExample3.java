package com.celcom.day7;

class MyThread3 implements Runnable {
	
	public void run(){
		for(int i=0; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread3());
		t1.setName("T1");
		
		Thread t2 = new Thread(new MyThread3());
		t2.setName("T2");
		
		t1.start(); // Running or Starting the thread
		t2.start();
	}

}
