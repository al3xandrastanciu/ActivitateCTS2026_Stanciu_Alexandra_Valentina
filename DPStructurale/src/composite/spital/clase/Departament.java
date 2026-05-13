package composite.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> structuri;

    public Departament(String nume) {
        this.nume = nume;
        this.structuri = new ArrayList<>();
    }
    public void adaugaStructura(Structura structura){
        structuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        structuri.remove(structura);
    }
    public Structura getStructura(int pozitie){
        return structuri.get(pozitie);
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Nume departament: "+this.nume);
        for(Structura structura:structuri){
            structura.afiseazaStructura(spatii+"     " +
                    "");
        }
    }
}
