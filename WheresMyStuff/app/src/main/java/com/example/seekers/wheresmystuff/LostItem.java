package com.example.seekers.wheresmystuff;

/**
 * Created by pritshah on 6/22/17.
 */

public class LostItem extends Item {
    private String name;
    private String color;
    private String description;
    private String address;

    public LostItem() {

    }

    public LostItem(String name, String color, String description, String address) {
        this.name = name;
        this.color = color;
        this.description = description;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Name: " + this.name + " Color: " + this.color + " Description: " + this.description
                + " Address: " + address;
    }
}
