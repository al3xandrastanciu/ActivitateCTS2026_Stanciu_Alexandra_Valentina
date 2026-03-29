package spital.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(int id, String nume, int schimb) {
        super(id, nume, schimb);
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Id: ").append(this.id).append(" ,Nume: ").append(this.nume).append(", lucreaza schimbul: ").append(this.schimb);
        System.out.println(sb.toString());
    }
}
