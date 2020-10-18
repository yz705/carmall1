package com.ytc.model;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = -903589261972255366L;
    private Integer id;

    private String name;

    private double price;

    private Dive dive;

    private Energy energy;

    private Country country;

    private Quantry quantry;

    private Gearbox gearbox;

    private Pinpai pinpai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dive getDive() {
        return dive;
    }

    public void setDive(Dive dive) {
        this.dive = dive;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Quantry getQuantry() {
        return quantry;
    }

    public void setQuantry(Quantry quantry) {
        this.quantry = quantry;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Pinpai getPinpai() {
        return pinpai;
    }

    public void setPinpai(Pinpai pinpai) {
        this.pinpai = pinpai;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dive=" + dive +
                ", energy=" + energy +
                ", country=" + country +
                ", quantry=" + quantry +
                ", gearbox=" + gearbox +
                ", pinpai=" + pinpai +
                '}';
    }
}