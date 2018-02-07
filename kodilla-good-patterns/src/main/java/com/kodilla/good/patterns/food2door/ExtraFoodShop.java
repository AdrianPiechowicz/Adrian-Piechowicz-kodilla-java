package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraFoodShop implements Supplier {

    final private String name = "ExtraFoodShop";
    List<Product> listOfProducts = new LinkedList<>();


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

        List<Product> temporaryList = listOfProducts.stream()
                .filter(Product->Product.getName().equals(purchaseRequest.product.getName()))
                .collect(Collectors.toList());


        if (temporaryList.get(0)!=null){
            if (temporaryList.get(0).getQuantity() >= purchaseRequest.getProduct().getQuantity()) {
                System.out.println("Purchase for " + purchaseRequest.getProduct().getName() + " was successful.");
            }
        } else {
            System.out.println("This product is unavailable.");
        }

    }
}
