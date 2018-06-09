package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class ChildSeatDecorator extends AbstractTaxiOrderDecorator{
    public ChildSeatDecorator(Taxiorder taxiorder) {
        super(taxiorder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + child seat";
    }
}
