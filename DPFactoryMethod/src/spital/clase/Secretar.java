package spital.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(int id, String nume) {
        super(id, nume);
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Id: ").append(this.id).append(" ,Nume: ").append(this.nume);
        System.out.println(sb.toString());
    }
}
