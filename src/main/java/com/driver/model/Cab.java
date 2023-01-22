package com.driver.model;

import javax.persistence.*;

@Entity
@Table

public class Cab{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int PerKmRate;

    private boolean Available;

    @OneToOne
    @JoinColumn
    private Driver driver;
    public Cab(){

    }
    public Cab(int perKmRate, boolean available) {
        PerKmRate = perKmRate;
        Available = available;
    }

    public int getPerKmRate() {
        return PerKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        PerKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }
}