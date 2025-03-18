package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    Random rand = new Random();

    public int code;
    public String name;
    public String description;
    public BigDecimal price;        //i BigDecimal vengono usati quando lavoriamo con le valute
    public BigDecimal iva;

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(1000) + 1; // numero casuale da 1 a 1000
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public BigDecimal priceDefault() {
        return this.price;
    }

    public BigDecimal getPriceIva() {
        if(price != null && iva != null){
            return price.multiply(iva).setScale(2, RoundingMode.DOWN); //setscale per gestire l'arrotondamento
        }else{
            return null;
        }
       
    }

    public String getFullName() {
        return code + "-" + name;
    }
}
