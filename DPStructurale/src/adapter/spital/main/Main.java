package adapter.spital.main;

import adapter.spital.aplicatieFarmacie.AdaptorMedicament;
import adapter.spital.aplicatieFarmacie.MedicamentFarmacie;
import adapter.spital.aplicatieSpital.MedicamentSpital;

public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital=new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie();
        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();
        AdaptorMedicament adaptorMedicament=new AdaptorMedicament(medicamentSpital);
        realizeazaAchizitie(adaptorMedicament);
    }
}