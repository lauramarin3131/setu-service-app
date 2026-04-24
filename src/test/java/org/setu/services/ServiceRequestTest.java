package org.setu.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceRequestTest {

    @Test
    void testInitialStatusIsPending() {
        ServiceRequest request = new ServiceRequest();

        assertEquals("Pending", request.getStatus());
    }

    @Test
    void testUpdateStatus() {
        ServiceRequest request = new ServiceRequest();
        request.updateStatus("Completed");

        assertEquals("Completed", request.getStatus());
    }

}