package adapter.spital.aplicatieSpital;

public class MedicamentSpital {
    public boolean prezintaReteta(){return true;}
    public void achizitioneazaMedicament(){
        System.out.println(this.prezintaReteta()?"Medicament achizitionat ": "Trebuie prezentata reteta");
    }
}
