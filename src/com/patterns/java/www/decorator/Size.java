package com.patterns.java.www.decorator;

public enum Size {


    MINI("Маленькая порция"),
    MIDDLE("Средняя порция"),
    MAXI("Большая порция");

    String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
