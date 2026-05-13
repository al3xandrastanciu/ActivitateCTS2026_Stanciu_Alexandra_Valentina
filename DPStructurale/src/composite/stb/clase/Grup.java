package composite.stb.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Flota{
    private String nume;
    private List<Flota> listaAutobuze;

    public Grup(String nume) {
        this.nume = nume;
        this.listaAutobuze=new ArrayList<>();
    }

    public void adaugaAutobuz(Flota autobuz){listaAutobuze.add(autobuz);}
    public void stergeAutobuz(Flota autobuz){listaAutobuze.remove(autobuz);}
    public Flota getAutobuz(int pozitie){return listaAutobuze.get(pozitie);}
    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare+"Nume grup "+this.nume);
        for(Flota flota:listaAutobuze){
            flota.afiseazaStructura("    ");
        }
    }
}
