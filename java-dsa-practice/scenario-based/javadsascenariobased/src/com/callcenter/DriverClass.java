package com.callcenter;

public class DriverClass {
	public static void main(String[] args) {
		QueueManager queueManager = new QueueManager();
		Customer c1 = new Customer("Name 1", false);
		Customer c2 = new Customer("Name 2", false);
		Customer c3 = new Customer("Name 3", false);
		Customer c4 = new Customer("Name 4", true);
		
		queueManager.addCustomer(c1);
		queueManager.addCustomer(c2);
		queueManager.addCustomer(c3);
		queueManager.addCustomer(c4);
		
		queueManager.call(c1);
		queueManager.call(c2);
		queueManager.call(c3);
		queueManager.call(c4);
		
		queueManager.makeCall();
		
		System.out.println(queueManager.mp);
	}
}
