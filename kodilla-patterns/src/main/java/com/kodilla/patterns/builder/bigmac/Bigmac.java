package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("sesame") || bun.equals("no sesame")) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Bun can be with or without sesame.");
            }
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard sauce") || sauce.equals("1000 island sauce") || sauce.equals("barbeque")) {
            this.sauce = sauce;
            return this;
            } else {
                throw new IllegalStateException("Chose from: standard sauce, 1000 island sauce or barbeque.");
            }
        }
        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals("salad") || ingredient.equals("onion") ||
                    ingredient.equals("beacon") || ingredient.equals("pickle") ||
            ingredient.equals("chilli peppers") || ingredient.equals("mushrooms") ||
            ingredient.equals("shrimps")) {
            ingredients.add(ingredient);
            return this;
            } else {
                throw new IllegalStateException("Chose from ingredients:\n" +
                        "salad, onion, beacon, pickle, chilli peppers, mushrooms or shrimps");
            }
        }
        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }
    public Bigmac(final String bun, final int burgers, final String sauce, final String... ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    /*public Bigmac(final String bun, final int burgers, final String sauce) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
    }*/

    public String getBun() {
        return bun;
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
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", \n ingredients : \n" + ingredients +
                '}';
    }
}
