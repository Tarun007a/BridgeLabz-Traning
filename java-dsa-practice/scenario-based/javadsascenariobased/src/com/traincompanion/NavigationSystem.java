package com.traincompanion;

public class NavigationSystem {
	Compartment head;
	
	public void addCompartment(String name) {
		Compartment compartment = new Compartment(name);
		
		if(head == null) {
			head = compartment;
			return;
		}
		
		Compartment temp = head;
		
		while(temp.next != null) temp = temp.next;
		
		compartment.prev = temp;
		temp.next = compartment;
	}
	
	public void showAdjecentCompartment() {
		if(head == null){
			System.out.println("You are not on any compartment");
			return;
		}
		else System.out.println("Currently on " + head.name);
		
		if(head.prev != null) System.out.println("Previous unit " + head.prev.name);
		else System.out.println("No previous unit");
		
		if(head.next != null) System.out.println("Next unit " + head.next.name);
		else System.out.println("No next unit");
	}
	
	public void moveToNext() {
		if(head == null){
			System.out.println("You are not on any compartment");
			return;
		}
		
		if(head.next == null){
			System.out.println("You are on last compartment cannot move to next");
			return;
		}
		
		head = head.next;
		System.out.println("Moved to " + head.name);
	}
	
	public void moveToPrevious() {
		if(head == null){
			System.out.println("You are not on any compartment");
			return;
		}
		
		if(head.prev == null){
			System.out.println("You are on first compartment cannot move to previous");
			return;
		}
		
		head = head.prev;
		System.out.println("Moved to " + head.name);
	}
}
