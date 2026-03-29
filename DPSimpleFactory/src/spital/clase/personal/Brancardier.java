package spital.clase.personal;

public class Brancardier implements  PersonalSpital {
    private String nume;
    private float salariu;
    private int vechime;

    public Brancardier(String nume, float salariu, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Brancardierul cu numele ").append(this.nume).append(" are salariul ").append(this.salariu).append(" lei si vechime de ").append(this.vechime).append(" ani.");
        System.out.println(sb.toString());
    }
}
