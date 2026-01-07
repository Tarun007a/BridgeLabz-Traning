package com.eventmanagement;

public interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
