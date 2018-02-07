package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GlutenFreeShop implements Supplier {

    final String name = "GlutenFreeShop";
    LinkedList<Product> listOfProducts = new LinkedList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Product> getListOfProducts() {
        return null;
    }

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        List<Product> temporaryList = listOfProducts.stream()
                .filter(Product->Product.getName().equals(purchaseRequest.getProduct().getName()))
                .filter(Product->Product.getQuantity()>=purchaseRequest.getProduct().getQuantity())
                .collect(Collectors.toList());

        if (temporaryList.get(0)!=null){
            System.out.println("Purchase for this request is done.");
        } else {
            System.out.println("No product or purchase amount found.");
        }
    }
}
