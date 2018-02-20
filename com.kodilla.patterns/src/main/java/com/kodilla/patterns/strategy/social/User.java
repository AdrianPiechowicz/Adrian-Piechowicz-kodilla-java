package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    protected PreferedSocialMedia preferedSocialMedia;

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PreferedSocialMedia getPreferedSocialMedia() {
        return preferedSocialMedia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreferedSocialMedia(PreferedSocialMedia preferedSocialMedia) {
        this.preferedSocialMedia = preferedSocialMedia;
    }
}
