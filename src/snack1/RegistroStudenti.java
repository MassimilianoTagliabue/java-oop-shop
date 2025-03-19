package snack1;

import java.util.ArrayList;

public class RegistroStudenti {

    private static ArrayList<Studente> listaSudenti = new ArrayList<>();
    private int counter = 0;

    public RegistroStudenti(){

    }

    public static void setStudente(Studente alunno){        
      listaSudenti.add(alunno);
    }

    public static void printRegistro(){
        for(int i=0; i<listaSudenti.size(); i++){
          Studente alunno = listaSudenti.get(i);
          System.out.println(alunno.getDati());
        }
    }
}
