package com.zipzipmart;

import java.time.LocalDate;

public class Transaction {
	LocalDate date;
	double amount;
	
	public Transaction(String date, double amount) {
		super();
		this.date = LocalDate.parse(date);
		this.amount = amount;
	}
	
	public String toString() {
		return date.toString() + " " + amount;
	}
}
