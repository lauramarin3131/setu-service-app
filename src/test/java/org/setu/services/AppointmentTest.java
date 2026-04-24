package org.setu.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    @Test
    void testInitiallyNotBooked() {
        Appointment appt = new Appointment();

        assertFalse(appt.isBooked());
    }

    @Test
    void testBooking() {
        Appointment appt = new Appointment();
        appt.book();

        assertTrue(appt.isBooked());
    }

    @Test
    void testCancel() {
        Appointment appt = new Appointment();
        appt.book();
        appt.cancel();

        assertFalse(appt.isBooked());
    }
}