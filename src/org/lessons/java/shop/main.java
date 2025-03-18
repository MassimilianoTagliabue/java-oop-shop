package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        Product acqua = new Product("acqua", "bevanda per idratarsi" , new BigDecimal(5), new BigDecimal(0.22));
        
    
        System.out.println("nome del prodotto = " + acqua.getName() + ", descrizione = " + acqua.getDescription());
        System.out.println("codice del prodotto = " + acqua.getCode() + ", nome completo = " + acqua.getFullName());
        System.out.println("prezzo = " + acqua.getPriceIva());

        
    }
}
