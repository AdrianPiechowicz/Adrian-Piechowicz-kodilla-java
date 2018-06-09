package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements Taxiorder {
    private final Taxiorder taxiorder;

    protected  AbstractTaxiOrderDecorator(Taxiorder taxiorder) {
        this.taxiorder = taxiorder;
    }

    @Override
    public BigDecimal getCost() {
        return taxiorder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiorder.getDescription();
    }
}
