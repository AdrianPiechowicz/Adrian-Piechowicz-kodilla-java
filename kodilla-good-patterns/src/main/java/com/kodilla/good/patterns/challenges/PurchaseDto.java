package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    User user;
    boolean isDone;

    public PurchaseDto (User user, boolean isDone) {
        this.user = user;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        if (isDone) {
            return user+"has bought this item";}
        else {
            return user+" failed to buy this item";
        }
    }
}
