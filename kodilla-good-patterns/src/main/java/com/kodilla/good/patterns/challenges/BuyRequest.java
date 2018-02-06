package com.kodilla.good.patterns.challenges;

public class BuyRequest {
    User user;
    Item item;
    int price;

    public BuyRequest(User user, Item item, int price) {
        this.user = user;
        this.item = item;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }
}
