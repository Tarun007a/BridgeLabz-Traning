package com.parceltracker;

public class TrackingSystem {
	public TrackingSystem(Parcel parcel) {
		State s1 = new State("packed");
		State s2 = new State("Shipped");
		State s3 = new State("In Transit");
		State s4 = new State("Delivered");
		s1.next = s2;
		s2.next = s3;
		s3.next = s4;
		parcel.currState = s1;
	}
	
	public void processParcel(Parcel parcel) {
		boolean isDelivered = false;
		while(parcel.currState != null) {
			System.out.println("Currently on " + parcel.currState.name);
			if(parcel.currState.name.equals("Delivered")) isDelivered = true;
			parcel.currState = parcel.currState.next;
		}
		if(!isDelivered) System.out.println("Item is lost refund started!");
	}
	
	public void addState(int idx, String name, Parcel parcel) {
		State state = new State(name);
		if(idx == 0) {
			state.next = parcel.currState;
			parcel.currState = state;
			return;
		}
		
		State temp = parcel.currState;
		while(idx > 1 && temp != null) {
			idx--;
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Please enter a valid index!");
			return;
		}
		state.next = temp.next;
		temp.next = state;
	}
	
	public void addNull(Parcel parcel) {
		parcel.currState.next = null;
	}
	
}
