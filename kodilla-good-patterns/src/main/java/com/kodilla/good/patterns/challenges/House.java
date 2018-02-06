package com.kodilla.good.patterns.challenges;

public class House implements Item {
    String name;
    int price;

    public House(String name, int price) {
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
