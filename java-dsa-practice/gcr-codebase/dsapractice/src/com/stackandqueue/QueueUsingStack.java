package com.stackandqueue;
import java.util.Stack;
import java.util.Scanner;

public class QueueUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> add = new Stack<>();
		Stack<Integer> remove = new Stack<>();
		
		System.out.println("Enter -1 to exit");
		System.out.println("Enter 0 to remove and 1 to add an element in queue");
		int choice = 1;
		
		while(choice != -1) {
			if(choice == 1) {
				System.out.print("Enter element to enter ");
				int ele = sc.nextInt();
				add.push(ele);
			}
			else {
				if(remove.isEmpty()) {
					while(!add.isEmpty()) remove.add(add.pop());
				}
				if(remove.isEmpty()) System.out.println("Stack is empty!");
				else System.out.println("Element remove is : " + remove.pop());
			}
			System.out.println("Enter 0 to remove and 1 to add an element in queue");
			choice = sc.nextInt();
		}
	}
}
