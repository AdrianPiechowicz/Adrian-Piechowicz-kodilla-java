package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiorderTestSuite {


    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculateCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(5.00),calculateCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course",description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(40),theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Taxi Network",description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(37),theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course by MyTaxi Network + child seat",description);
    }

    @Test
    public void testUberWithTwoChildSeatGetCost() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(29),theCost);
    }

    @Test
    public void testUberWithTwoChildSeatGetDescription() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Uber Network + child seat + child seat",description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(52),theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        Taxiorder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat",description);
    }
}