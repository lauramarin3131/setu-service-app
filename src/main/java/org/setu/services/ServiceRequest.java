package org.setu.services;

public class ServiceRequest {
    private String status;

    public ServiceRequest() {
        this.status = "Pending";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}