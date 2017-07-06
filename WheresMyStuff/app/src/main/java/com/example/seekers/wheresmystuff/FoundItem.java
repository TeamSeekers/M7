package com.example.seekers.wheresmystuff;

/**
 * Created by pritshah on 6/24/17.
 */

public class FoundItem extends Item {
    private String name;
    private String color;
    private String description;
    private String address;

    public FoundItem() {

    }

    public FoundItem(String name, String color, String description, String address) {
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
        return this.name + "/" + this.color + "/" + this.description + "/" + address;
    }
}
