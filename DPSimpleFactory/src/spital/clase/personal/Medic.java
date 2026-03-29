package spital.clase.personal;

public class Medic implements PersonalSpital{
    private String nume;
    private float salariu;
    private int vechime;

    public Medic(String nume, float salariu, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Medicul ").append(this.nume).append(" are salariu in valoare de ").append(this.salariu).append(" lei.").append(" si vechime de").append(this.vechime).append(" ani.");
        System.out.println(sb.toString());
    }
}
