package com.aps.application.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RFDataEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private double rssi;
    private Double altitude;
    private double middleFrequency;

    public double getRssi() {
        return rssi;
    }

    public void setRssi(double rssi) {
        this.rssi = rssi;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public double getMiddleFrequency() {
        return middleFrequency;
    }

    public void setMiddleFrequency(double middleFrequency) {
        this.middleFrequency = middleFrequency;
    }
}

