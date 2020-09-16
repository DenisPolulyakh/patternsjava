package com.patterns.java.www.decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.size;
    }

    @Override
    public Beverage setSize(Size size) {
        beverage.size= size;
        return beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .45 + beverage.cost();
    }
}
