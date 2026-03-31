package test6CompanieAeriana.simpleFactory.clase;

public class Pilot implements Personal{
    private String nume;
    private double salariu;

    public Pilot(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Pilotul cu numele ").append(this.nume).append(" are salariul de ").append(this.salariu).append(" lei");
        System.out.println(sb.toString());
    }
}
