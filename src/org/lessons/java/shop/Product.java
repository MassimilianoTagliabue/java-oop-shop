package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    Random rand = new Random();

    public static String nomeNegozio = "eurospin";

    private int code;
    private String name;
    private String description;
    private BigDecimal price;        //i BigDecimal vengono usati quando lavoriamo con le valute
    private BigDecimal iva;

    public Product(){
        this.code = rand.nextInt(1000) + 1; // numero casuale da 1 a 1000
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(1000) + 1; // numero casuale da 1 a 1000
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode(){
        return code;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }

    public BigDecimal getIva(){
        return iva;
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
