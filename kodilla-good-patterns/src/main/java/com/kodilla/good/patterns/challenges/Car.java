package com.kodilla.good.patterns.challenges;

public class Car implements Item {
    String name;
    int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
