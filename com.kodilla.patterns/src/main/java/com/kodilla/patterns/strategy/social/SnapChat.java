package com.kodilla.patterns.strategy.social;

public class SnapChat implements PreferedSocialMedia {
    @Override
    public String share() {
        return "SnapChat";
    }
}
