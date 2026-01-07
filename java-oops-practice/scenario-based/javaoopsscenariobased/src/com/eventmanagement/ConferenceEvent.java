package com.eventmanagement;

public class ConferenceEvent extends Event {
    private boolean catering;
    private boolean decoration;

    public ConferenceEvent(int eventId, String eventName, String location, String date, int attendees, User organizer) {
        super(eventId, eventName, location, date, attendees, organizer);
        catering = false;
        decoration = false;
    }

    public ConferenceEvent(int eventId, String eventName, String location, String date, int attendees, User organizer, boolean catering, boolean decoration) {
        super(eventId, eventName, location, date, attendees, organizer);
        this.catering = catering;
        this.decoration = decoration;
    }

    public void schedule() {
        double venueCost = 15000;
        double serviceCost = 0;
        
        if(catering) serviceCost += 10000;
        if(decoration) serviceCost += 5000;
        
        double discount = 1000;
        double total = venueCost + serviceCost - discount;
        
        setTotalCost(total);
        System.out.println("Conference Event Cost : " + total);
    }

    public void reschedule(String date) {
        this.date = date;
        System.out.println("Conference Event Rescheduled to " + date);
    }

    public void cancel() {
        System.out.println("Conference Event Cancelled");
    }
}
