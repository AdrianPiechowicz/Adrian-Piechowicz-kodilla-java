package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public interface Taxiorder {
    BigDecimal getCost();
    String getDescription();
}
