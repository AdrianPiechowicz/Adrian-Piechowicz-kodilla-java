package com.kodilla.good.patterns.food2door;

public class PurchaseRequest {
    Product product;
    int quantity;

    public PurchaseRequest(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
