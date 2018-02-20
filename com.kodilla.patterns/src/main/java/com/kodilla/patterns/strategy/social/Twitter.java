package com.kodilla.patterns.strategy.social;

public class Twitter implements PreferedSocialMedia {
    @Override
    public String share() {
        return "Twitter";
    }
}
