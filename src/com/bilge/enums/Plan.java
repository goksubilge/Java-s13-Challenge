package com.bilge.enums;

public enum Plan {
    PINK ("normal",1000),
    PINKBONUS ("plus",3000),
    PINKSPECIAL ("special", 8000);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;}

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
