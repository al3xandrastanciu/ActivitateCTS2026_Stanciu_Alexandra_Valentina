package spital.clase.personal;

public class Asistent implements PersonalSpital{
    private String nume;
    private float salariu;
    private int vechime;

    public Asistent(String nume, float salariu, int vechime) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechime = vechime;
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Asistentul ").append(this.nume).append(" are salariu  ").append(this.salariu).append(" si vechime de ").append(this.vechime).append(" ani.");
        System.out.println(sb.toString());
    }
}
