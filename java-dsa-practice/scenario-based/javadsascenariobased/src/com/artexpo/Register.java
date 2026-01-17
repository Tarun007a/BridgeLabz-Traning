package com.artexpo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Register {
	private static void sort(ArrayList<Artist> artists) {
		int n = artists.size();
		
		int j = n-2;
		while(j >= 0 && artists.get(j).time.isAfter(artists.get(j+1).time)) {
			Artist temp = artists.get(j);
			artists.set(j, artists.get(j+1));
			artists.set(j+1, temp);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Artist> artists = new ArrayList<>();
		
		System.out.println("Artists Registration");
		while(true) {
			System.out.println("Enter 1 to enter artist or enter any number to exit");
			if(sc.nextInt() == 1) {
				String name = sc.nextLine();
				
				System.out.println("Enter time in hours : ");		
				int h = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter time in minutes : ");	
				int m = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter time in seconds : ");	
				int s = sc.nextInt();
				sc.nextLine();
				
				Artist artist = new Artist(name, LocalTime.of(h, m, s));
				artists.add(artist);
				sort(artists);
				System.out.println(artists);
			}
			else return;
		}
	}
}
