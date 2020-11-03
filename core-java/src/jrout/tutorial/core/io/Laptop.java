package jrout.tutorial.core.io;

import java.io.Serializable;

public class Laptop implements Serializable {
    private String name;
    private String company;
    private transient float price; // 0.0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
