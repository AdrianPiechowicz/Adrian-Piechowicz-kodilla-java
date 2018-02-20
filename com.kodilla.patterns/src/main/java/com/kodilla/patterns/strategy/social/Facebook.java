package com.kodilla.patterns.strategy.social;

public class Facebook implements PreferedSocialMedia {
    @Override
    public String share() {
        return "Facebook";
    }
}
