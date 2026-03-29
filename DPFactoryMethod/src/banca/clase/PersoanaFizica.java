package banca.clase;

public  class PersoanaFizica implements Client{
    protected String nume;

    public PersoanaFizica(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientul cu numele ").append(this.nume).append(" este o persoana fizica.");
        System.out.println(sb.toString());
    }
}
