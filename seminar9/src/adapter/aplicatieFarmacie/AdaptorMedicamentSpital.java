package adapter.aplicatieFarmacie;

import adapter.aplicatieSpital.MedicamentSpital;

public class AdaptorMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
