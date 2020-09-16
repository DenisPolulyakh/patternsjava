package com.patterns.java.www.decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
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
    public double cost() {
        return .20 + beverage.cost();
    }
}
