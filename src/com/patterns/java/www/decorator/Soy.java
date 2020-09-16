package com.patterns.java.www.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
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

        double price = 0;
        if (getSize().equals(Size.MAXI)) {
            price = .20;
        }
        if (getSize().equals(Size.MIDDLE)) {
            price = .15;
        }
        if (getSize().equals(Size.MINI)) {
            price = .10;
        }
        return price + beverage.cost();
    }
}
