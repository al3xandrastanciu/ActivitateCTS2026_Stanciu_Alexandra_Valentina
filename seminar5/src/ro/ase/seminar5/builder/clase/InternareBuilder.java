package ro.ase.seminar5.builder.clase;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);
    }

    public InternareBuilder  setPatRabatabil(boolean patRabatabil){
        internare.setPatRabatabil(patRabatabil);
        return this;
    }

    public InternareBuilder setMicDejun(boolean micDejun){
        internare.setMicDejun(micDejun);
        return this;
    }

    public InternareBuilder setPapuci(boolean papuci){
        internare.setPapuci(papuci);
        return this;
    }

    public InternareBuilder sethalat(boolean halat){
        internare.setHalat(halat);
        return this;
    }

    public InternareBuilder setNumePacient(String numePacient){
        internare.setNumePacient(numePacient);
        return this;
    }


    @Override
    public Internare build() {
        return internare;
    }
}
