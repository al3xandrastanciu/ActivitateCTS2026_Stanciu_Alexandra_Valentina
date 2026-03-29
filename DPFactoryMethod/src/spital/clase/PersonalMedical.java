package spital.clase;

public abstract class PersonalMedical implements Personal{
    protected int id;
    protected String nume;
    protected int schimb;

    public PersonalMedical(int id, String nume, int schimb) {
        this.id = id;
        this.nume = nume;
        this.schimb = schimb;
    }
}
