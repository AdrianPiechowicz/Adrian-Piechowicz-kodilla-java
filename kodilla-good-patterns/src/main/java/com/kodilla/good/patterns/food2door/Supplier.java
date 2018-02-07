package com.kodilla.good.patterns.food2door;

import java.util.List;


public interface Supplier {
    String getName();
    List<Product> getListOfProducts();
    void process(PurchaseRequest purchaseRequest);
}
