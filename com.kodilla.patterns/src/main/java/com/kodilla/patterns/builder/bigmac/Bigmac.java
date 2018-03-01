package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;

    }

    public static class BigmacBuilder {
        private String roll = "";
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            if (!(roll.equals("Normal")||(roll.equals("Sesam")))) {
                throw new IllegalStateException("Choose between normal or sesam roll.");
            }
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers>3) {
                throw new IllegalStateException("No more than 3 burgers!");
            }
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (!(sauce.equals("BBQ") || sauce.equals("Thousand of Islands") || sauce.equals("Standard"))) {
                throw new IllegalStateException("Choose between BBQ, Thousand of Islands and Standard sauces.");
            }
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll,burgers,sauce,ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String result = "This Bigmac is made of " + roll + " roll" +
                ", "+burgers+" burgers, " +sauce+" sauce and ";
        String listOfIngridients = "";
        for (String ingridient: ingredients) {
            listOfIngridients += ingridient +", ";
        }
        return result + listOfIngridients;
    }
}
