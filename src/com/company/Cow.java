package com.company;

public class Cow extends animal{

    private String lastFed;

    public Cow(String name, int age, String breed, String lastFed) {
        super(name, age, breed);
        this.lastFed = lastFed;
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "lastFed='" + lastFed + '\'' +
                '}';
    }

}
