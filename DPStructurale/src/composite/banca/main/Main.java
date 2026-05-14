package composite.banca.main;

import composite.banca.clase.Agentie;
import composite.banca.clase.Filiala;
import composite.banca.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura filiala=new Filiala("aaa");
        Agentie agentie=new Agentie("agentie");
        agentie.adaugaNod(filiala);
        agentie.afiseazaStructura("   ");
    }
}
