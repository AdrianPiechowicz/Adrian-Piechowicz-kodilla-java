package com.kodilla.good.patterns.challenges;

public class PurchaseProcessor {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public PurchaseProcessor(InformationService informationService, PurchaseService purchaseService, PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process (final BuyRequest buyRequest){
        boolean isAvailable = purchaseService.buy(buyRequest.getItem());
        boolean hasMoney = (buyRequest.getUser().getMoneyAmount()>buyRequest.getItem().getPrice());

        if (isAvailable && hasMoney){
            informationService.inform(buyRequest.getUser());
            purchaseRepository.createPurchase(buyRequest.getUser(),buyRequest.getItem(),buyRequest.getItem().getPrice());
            return new PurchaseDto(buyRequest.getUser(),true);
        } else {
            return new PurchaseDto(buyRequest.getUser(),false);
        }

    }
}
