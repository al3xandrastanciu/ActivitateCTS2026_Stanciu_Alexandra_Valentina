package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> subStructuri;

    public Departament(String nume) {
        this.nume = nume;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        subStructuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        subStructuri.remove(structura);
    }
    public Structura getStructura(int pozitie){
        return subStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume departament: "+nume);
        for(Structura structura: subStructuri){
            structura.afiseazaDetaliiStructura(spatii+ "   ");
        }
    }
}
