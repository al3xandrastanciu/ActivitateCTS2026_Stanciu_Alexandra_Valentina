package composite.banca.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie {
    private String nume;
    private List<Structura> filiale;

    public Agentie(String nume) {
        this.nume = nume;
        this.filiale = new ArrayList<>();
    }
    public void adaugaNod(Structura filiala){
        filiale.add(filiala);
    }
    public void afiseazaStructura(String indentare){
        System.out.println(indentare+"Agentie "+this.nume);
        for(Structura filiala:filiale){
           filiala.afiseazaStructura(indentare);
        }
    }
}
