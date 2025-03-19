package snack1;

import java.util.ArrayList;

public class main {


    public static void main(String[] args) {
        
        Studente gino = new Studente("Gino", "pino", 34);

       
        RegistroStudenti.setStudente(gino);
        RegistroStudenti.setStudente(new Studente("Topo", "Gigio", 90));

        RegistroStudenti.printRegistro();
    }
}
