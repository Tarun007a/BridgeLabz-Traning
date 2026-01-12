package com.trafficmanager;

import java.util.ArrayDeque;
import java.util.Queue;


public class TrafficManager {
	private final int size;
	Queue<VehicleNode> waitingQueue = new ArrayDeque<>();
	VehicleNode head;
	
	public TrafficManager(int size) {
		this.size = size;
	}
	
	public void addInQueue(int id, String name) {
		if(waitingQueue.size() == size) {
			System.out.println("Queue overflow!");
			return;
		}
		
		VehicleNode curr = new VehicleNode(id, name);
		waitingQueue.add(curr);
	}
	
	public void addInPath() {
		if(waitingQueue.isEmpty()) {
			System.out.println("Queue underflow!");
			return;
		}
		
		VehicleNode curr = waitingQueue.remove();
		System.out.println(curr.id + " " + curr.name + " added to path");
		if(head == null) {
			head = curr;
			head.next = curr;
			return;
		}
		
		curr.next = head.next;
		head.next = curr;
	}
	
	public void remove(int id) {
		if(head == null) {
			System.out.println("Please enter vehicle to remove");
			return;
		}
		
		if(head == head.next) {
			if(head.id == id) head = null;
			else System.out.println("Enter a valid velicle id.");
			return;
		}
		
		VehicleNode temp = head.next;
		while(temp != head && temp.next.id != id) temp = temp.next;
		
		if(temp == head) {
			System.out.println("Enter a valid velicle id.");
			return;
		}
		
		if(temp.next == head) head = head.next;
		temp.next = temp.next.next;
	}
	
	public void printState() {
		if(head == null) {
			System.out.println("Please add vehicle to print!");
			return;
		}
		
		System.out.print(head.id + " " + head.name);
		
		VehicleNode temp = head.next;
		while(temp != head) {
			System.out.print(" -> " + temp.id + " " + temp.name);
			temp = temp.next;
		}
		System.out.println();
	}
}
