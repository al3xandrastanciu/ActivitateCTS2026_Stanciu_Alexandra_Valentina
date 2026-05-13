package composite.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item{
    private String nume;
    private List<Item> subsectiuni;

    public Sectiune(String nume) {
        this.nume = nume;
        this.subsectiuni=new ArrayList<>();
    }
    public void adaugaProdus(Item produs){subsectiuni.add(produs);}
    public void stergeProdus(Item produs){subsectiuni.remove(produs);}
    public Item getProdus(int pozitie){
        return subsectiuni.get(pozitie);
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare+"Nume sectiune: "+this.nume);
        for(Item i : subsectiuni){
            i.afiseazaStructura("   ");
        }
    }
}
