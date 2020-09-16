package com.patterns.java.www.decorator;

public abstract  class CondimentDecorator extends  Beverage {



    public abstract String getDescription();

    public abstract Size getSize();

    public abstract Beverage setSize(Size size);
}
