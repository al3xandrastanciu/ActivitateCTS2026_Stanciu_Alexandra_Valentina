package adapter.main;

import adapter.aplicatieFarmacie.AdaptorMedicamentSpital;
import adapter.aplicatieFarmacie.MedicamentFarmacie;
import adapter.aplicatieSpital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie= new MedicamentFarmacie();

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        AdaptorMedicamentSpital adaptorMedicamentSpital= new AdaptorMedicamentSpital(medicamentSpital);
        realizeazaAchizitie(adaptorMedicamentSpital);
    }
}