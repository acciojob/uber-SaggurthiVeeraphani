package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TripId;
    private String Fromlocation;
    private String Tolocation;
    private int DistanceInKM;

    @Enumerated(value = EnumType.STRING)
    private TripStatus tripStatus;
    private int bill;

    @ManyToOne
    @JoinColumn
    private Driver driver;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    public TripBooking() {
    }

    public TripBooking(String fromlocation, String tolocation, int distanceInKM, TripStatus tripStatus, int bill) {
        Fromlocation = fromlocation;
        Tolocation = tolocation;
        DistanceInKM = distanceInKM;
        this.tripStatus = tripStatus;
        this.bill = bill;
    }

    public String getFromlocation() {

        return Fromlocation;
    }

    public void setFromlocation(String fromlocation) {
        Fromlocation = fromlocation;
    }

    public String getTolocation() {
        return Tolocation;
    }

    public void setTolocation(String tolocation) {
        Tolocation = tolocation;
    }

    public int getDistanceInKM() {
        return DistanceInKM;
    }

    public void setDistanceInKM(int distanceInKM) {
        DistanceInKM = distanceInKM;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTripId() {
        return TripId;
    }
}