package ro.ase.seminar6.factoryMethod.clase;

public class Papanasi extends Desert{
    public Papanasi(float gramaj, String denumire, float calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("Papanasii "+super.denumire+" are "+ super.gramaj+" grame si "+super.calorii+" calorii.");
    }
}
