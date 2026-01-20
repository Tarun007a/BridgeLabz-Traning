package com.foodfest;

import java.util.ArrayList;

public class Zone {
	int id;
	ArrayList<Integer> footfallCount = new ArrayList<>();
	
	public Zone(int id, ArrayList<Integer> footfallCount) {
		this.id = id;
		this.footfallCount = footfallCount;
	}
}
