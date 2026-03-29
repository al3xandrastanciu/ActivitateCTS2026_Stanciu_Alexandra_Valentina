package banca.clase;

public  class PersoanaJuridica implements Client {
    protected String nume;

    public PersoanaJuridica(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul cu numele ").append(this.nume).append(" este o persoana juridica.");
        System.out.println(sb.toString());
    }
}
