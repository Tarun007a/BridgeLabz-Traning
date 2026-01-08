package com.pharmacyinventory;

import java.time.LocalDate;

public class DriverClass {
	public static void main(String[] args) {
		Medicine tablet = new Tablet("Tablet 1", 100, LocalDate.now().plusDays(10));
		Medicine injection = new Injection("Injection 1", 1000, LocalDate.now().plusDays(5));
		Medicine syrup = new Syrup("Syrup 1", 500, LocalDate.now().plusDays(7));
		
		System.out.println(tablet.sell(10));
		System.out.println(injection.sell(1));
		System.out.println(syrup.sell(1));
	}
}
