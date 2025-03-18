package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        Product prod1 = new Product("acqua", "bevanda per idratarsi" , new BigDecimal(5), new BigDecimal(0.22));
        
        
        System.out.println("nome del prodotto = " + prod1.name + ", descrizione = " + prod1.description);
        System.out.println("codice del prodotto = " + prod1.code + ", nome completo = " + prod1.getFullName());
        System.out.println("prezzo = " + prod1.getPriceIva());
    }
}
