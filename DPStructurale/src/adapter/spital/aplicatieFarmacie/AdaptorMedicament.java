package adapter.spital.aplicatieFarmacie;

import adapter.spital.aplicatieSpital.MedicamentSpital;

public class AdaptorMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
