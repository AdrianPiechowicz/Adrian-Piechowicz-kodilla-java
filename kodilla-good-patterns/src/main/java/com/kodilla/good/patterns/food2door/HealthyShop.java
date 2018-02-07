package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

public class HealthyShop implements Supplier {

    final private String name = "HealthyShop";
    List<Product> listOfProducts = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if (listOfProducts.contains(purchaseRequest.getProduct())){
            int temporaryValue =listOfProducts.get(listOfProducts.indexOf(purchaseRequest.getProduct())).getQuantity();
            if (purchaseRequest.getProduct().quantity>temporaryValue){
                System.out.println("Purchase was completed.");
            } else {
                System.out.println("Purchase quantity exceed available amount.");
            }
        } else {
            System.out.println("This product is not available.");
        }
    }
}
