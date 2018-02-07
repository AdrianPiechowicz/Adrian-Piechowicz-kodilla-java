package com.kodilla.good.patterns.food2door;

public class Food2Door {
    public static void main (String[] args) {

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.listOfProducts.add(new Product("Wheat",5));

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.listOfProducts.add(new Product("Bread",5));
        healthyShop.listOfProducts.add(new Product("Milk",2));
        healthyShop.listOfProducts.add(new Product("Butter",5));

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.listOfProducts.add(new Product("Beer",10));

        PurchaseRequest purchaseRequest = new PurchaseRequest(new Product("Wheat",1),4);
        PurchaseRequest purchaseRequest1 = new PurchaseRequest(new Product("Milk",1),5);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest(new Product("Beer",1),15);

        glutenFreeShop.process(purchaseRequest);
        healthyShop.process(purchaseRequest);
        healthyShop.process(purchaseRequest1);
        extraFoodShop.process(purchaseRequest2);
    }
}
