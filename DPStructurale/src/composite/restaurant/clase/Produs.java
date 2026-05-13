package composite.restaurant.clase;

public class Produs implements Item{
    private String nume;
    private double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret=pret;
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare+"Produsul "+this.nume+" arepretul "+this.pret);
    }
}
