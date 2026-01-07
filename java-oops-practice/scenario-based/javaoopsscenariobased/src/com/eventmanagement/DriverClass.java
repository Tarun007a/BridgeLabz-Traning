package com.eventmanagement;

public class DriverClass {
    public static void main(String[] args) {
        User user = new User("Aman", "aman@mail.com");

        Event birthday = new BirthdayEvent(1, "Birthday", "Location 1", "10-01-2026", 30, user, true, true);
        Event conference = new ConferenceEvent(2, "Conference", "Location 2", "15-01-2026", 150, user, true, true);

        user.displayUser();

        birthday.displayEvent();
        birthday.schedule();
        birthday.reschedule("12-02-2026");

        conference.displayEvent();
        conference.schedule();
        conference.cancel();
    }
}
