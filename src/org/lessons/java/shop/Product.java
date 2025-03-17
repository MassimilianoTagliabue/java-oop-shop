package org.lessons.java.shop;

import java.util.Random;

public class Product {
    Random rand = new Random();

    public int code;
    public String name;
    public String description;
    public float price = 0;
    public float iva = 0;
    public String fullName;

    public Product(String name, String description, float price) {

        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setCode() {
        this.code = rand.nextInt(1000) + 1; // numero casuale da 1 a 1000
    }

    public void priceDefault(float price) {
        if (price == 0) {
            this.price = 5.00f;
        }
    }

    public void setIva(float price) {
        this.iva = price * 0.22f;
    }

    public void setFullName(int code, String name) {
        this.fullName = code + "-" + name;
    }
}
