package com.eventmanagement;

public abstract class Event implements ISchedulable {
    public String eventName;
    public String location;
    public String date;
    public int attendees;
    public User organizer;
    private final int eventId;
    private double totalCost;

    public Event(int eventId, String eventName, String location, String date, int attendees, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.totalCost = 0;
    }

    protected void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getEventId() {
        return eventId;
    }

    public void displayEvent() {
        System.out.println(eventId + " " + eventName + " " + location + " " + date + " " + attendees);
    }
}
