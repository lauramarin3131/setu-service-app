package org.setu.services;

public class Appointment {
    private boolean booked;

    public Appointment() {
        this.booked = false;
    }

    public void book() {
        booked = true;
    }

    public void cancel() {
        booked = false;
    }

    public boolean isBooked() {
        return booked;
    }
}