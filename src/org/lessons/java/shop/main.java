package org.lessons.java.shop;

public class main {

    public static void main(String[] args) {
        Product prod1 = new Product("acqua", "bevanda per idratarsi" , 13.30f);

        prod1.setCode();
        prod1.priceDefault(prod1.price);
        prod1.setIva(prod1.price);
        prod1.setFullName(prod1.code, prod1.name);


        System.out.println("nome del prodotto = " + prod1.name + ", descrizione = " + prod1.description);
        System.out.println("codice del prodotto = " + prod1.code + ", nome completo = " + prod1.fullName);
        System.out.println("prezzo = "+ prod1.price + " di cui l'iva è =" + prod1.iva);
    }
}
