package com.eventmanagement;

public class BirthdayEvent extends Event {
    private boolean catering;
    private boolean decoration;

    public BirthdayEvent(int eventId, String eventName, String location, String date, int attendees, User organizer) {
        super(eventId, eventName, location, date, attendees, organizer);
        catering = false;
        decoration = false;
    }

    public BirthdayEvent(int eventId, String eventName, String location, String date, int attendees, User organizer, boolean catering, boolean decoration) {
        super(eventId, eventName, location, date, attendees, organizer);
        this.catering = catering;
        this.decoration = decoration;
    }

    public void schedule() {
        double venueCost = 5000;
        double serviceCost = 0;
        
        if(catering) serviceCost += 3000;
        if(decoration) serviceCost += 2000;
        
        double discount = 500;
        double total = venueCost + serviceCost - discount;
        
        setTotalCost(total);
        System.out.println("Birthday Event Cost : " + total);
    }

    public void reschedule(String date) {
        this.date = date;
        System.out.println("Birthday Event Rescheduled to " + date);
    }

    public void cancel() {
        System.out.println("Birthday Event Cancelled");
    }
}
