package com.kodilla.good.patterns.challenges;

public class Store {

    public static void main (String[] args) {

        InformationService informationService = new InformationService();
        PurchaseRepository purchaseRepository = new PurchaseRepository();
        PurchaseService purchaseService = new PurchaseService();
        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(informationService,purchaseService,purchaseRepository);

        BuyRequest request1 = new BuyRequest(new User("Jan Kowalski", "Janko",1000),new House("PKiN",1000000),100000);
        PurchaseDto purchaseDto = purchaseProcessor.process(request1);

        System.out.println(purchaseDto);

    }
}
