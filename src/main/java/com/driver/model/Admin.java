package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;


    // Constructors
    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
     //Getters and Setters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}