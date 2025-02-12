package com.celcom.day7;

class Resource1 {
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

class Writer extends Thread{
	Resource1 resource;
	
	Writer(Resource1 resource){
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized(resource) {
			System.out.println("Writer is writing the data...");
			resource.setData("Hello Reader");
			
		}
	}
}

class Reader extends Thread{
	Resource1 resource;
	Reader(Resource1 resource){
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized(resource) {
			System.out.println("Reader is waiting for writer to write the data");
			try {
				resource.wait();
			} catch (InterruptedException e) {}
			System.out.println("Data from Reader: "+ resource.getData());
		}
	}
}

public class DeadLockExample {

	public static void main(String[] args) throws InterruptedException {
		Resource1 resource = new Resource1();
		
		Reader reader = new Reader(resource);
		reader.start();
		
		Thread.sleep(2000);
		
		Writer writer = new Writer(resource);
		writer.start();
	}

}
