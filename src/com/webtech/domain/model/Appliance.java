package com.webtech.domain.model;

/**
 * Appliance class with properties <b>type, name, price</b>.
 *
 * @author Maksim Malenho
 * @version 1.0
 */
public class Appliance {
    /**
     * Field type - type of {@link Appliance}
     */
    private String type;
    /**
     * Field name - name of {@link Appliance}
     */
    private String name;
    /**
     * Field price - price of {@link Appliance}
     */
    private float price;

    /**
     * {@link Appliance} constructor with parameters
     *
     * @param type type
     * @param name name
     * @param price price
     */
    public Appliance(String type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     * Gets price value
     *
     * @return price
     */
    public float getPrice() {
        return price;
    }


    /**
     * Gets name value
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets type value
     *
     * @return type
     */
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
