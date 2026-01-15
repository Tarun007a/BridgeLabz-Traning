package com.eventmanager;

import java.util.Arrays;

public class DriverManager {
	private static int partition(int lo, int hi, Ticket[] tickets) {
		double pivot = tickets[hi].price;
		
		int i = lo-1;
		for(int j = lo; j < hi; j++) {
			if(tickets[j].price < pivot) {
				i++;
				Ticket temp = tickets[i];
				tickets[i] = tickets[j];
				tickets[j] = temp;
			}
		}

		Ticket temp = tickets[i+1];
		tickets[i+1] = tickets[hi];
		tickets[hi] = temp;
		return i+1;
	}
	
	private static void quickSort(int lo, int hi, Ticket[] tickets) {
		if(lo >= hi) return;
		int idx = partition(lo, hi, tickets);
		
		quickSort(lo, idx-1, tickets);
		quickSort(idx+1, hi, tickets);
	}
	
	private static void sort(Ticket[] tickets) {
		quickSort(0, tickets.length-1, tickets);
	}
	public static void main(String[] args) {
		Ticket[] tickets = {
				new Ticket("type 1", 100), 
				new Ticket("type 2", 500), 
				new Ticket("type 3", 1000),
				new Ticket("intermidiate 1", 750),
				new Ticket("intermidiate 2", 850)
		};
		sort(tickets);
		
		System.out.println(Arrays.toString(tickets));
	}
}
