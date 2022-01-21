package com.company;

public class Sheep extends animal{

    private String lastSheared;

    public Sheep(String name, int age, String breed, String lastSheared) {
        super(name, age, breed);
        this.lastSheared = lastSheared;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "lastSheared='" + lastSheared + '\'' +
                '}';
    }

    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }
}
