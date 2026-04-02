package test10Sala.factoryMethod.clase;

public class EchipamentMecanic implements IEchipament{
    private String nume;

    public EchipamentMecanic(String nume) {
        this.nume = nume;
    }

    @Override
        public void verificaStare() {
        System.out.println("Echipament mecanic: "+this.nume+" este in stare buna.");
        }
}
