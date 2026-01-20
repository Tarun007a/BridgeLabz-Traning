package com.gamezone;

import java.util.Arrays;

public class GenerateRanking {
	private static int partition(int lo, int hi, Player[] players) {
		double pivot = players[hi].score;
		
		int i = lo-1;
		for(int j = lo; j < hi; j++) {
			if(players[j].score > pivot) {
				i++;
				Player temp = players[i];
				players[i] = players[j];
				players[j] = temp;
			}
		}

		Player temp = players[i+1];
		players[i+1] = players[hi];
		players[hi] = temp;
		return i+1;
	}
	
	private static void quickSort(int lo, int hi, Player[] players) {
		if(lo >= hi) return;
		int idx = partition(lo, hi, players);
		
		quickSort(lo, idx-1, players);
		quickSort(idx+1, hi, players);
	}
	
	private static void sort(Player[] players) {
		quickSort(0, players.length-1, players);
	}
	
	public static void main(String[] args) {
		Player[] players = {
				new Player("Player 1", 1), 
				new Player("Player 2", 5),
				new Player("Player 3", 4), 
				new Player("Player 4", 2), 
				new Player("Player 5", 3)
		};
		
		sort(players);
		System.out.println(Arrays.toString(players));
	}
}
