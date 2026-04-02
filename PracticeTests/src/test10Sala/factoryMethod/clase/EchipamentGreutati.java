package test10Sala.factoryMethod.clase;

public class EchipamentGreutati implements IEchipament{
    private String nume;

    public EchipamentGreutati(String nume) {
        this.nume = nume;
    }

    @Override
    public void verificaStare() {
        System.out.println("Echipament greutati: "+this.nume+" este in stare buna");
    }
}
