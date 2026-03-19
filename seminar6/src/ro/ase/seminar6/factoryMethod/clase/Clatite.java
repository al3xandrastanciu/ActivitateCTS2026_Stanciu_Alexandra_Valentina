package ro.ase.seminar6.factoryMethod.clase;

public class Clatite extends Desert{
    public Clatite(float gramaj, String denumire, float calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatitele "+super.denumire+" are "+ super.gramaj+" grame si "+super.calorii+" calorii.");
    }
}
