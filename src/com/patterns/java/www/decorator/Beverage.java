package com.patterns.java.www.decorator;

public abstract  class Beverage {
    String description ="Unknown description";

    Size size=Size.MIDDLE;

    public String getDescription() {
        return description;
    }

     public abstract double cost();
}
