package com.webtech.domain.model;

public class Appliance {
    private String type;
    private String name;
    private float price;

    public Appliance(String type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
