package com.example.ticketsapp;

import java.io.Serializable;

public class suchnost implements Serializable {
    private String ID;
    private String place;
    private String On;
    private String Off;
    private String cash;

    public suchnost(String ID, String place, String on, String off, String cash) {
        this.ID = ID;
        this.place = place;
        On = on;
        Off = off;
        this.cash = cash;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getOn() {
        return On;
    }

    public void setOn(String on) {
        On = on;
    }

    public String getOff() {
        return Off;
    }

    public void setOff(String off) {
        Off = off;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }
}

