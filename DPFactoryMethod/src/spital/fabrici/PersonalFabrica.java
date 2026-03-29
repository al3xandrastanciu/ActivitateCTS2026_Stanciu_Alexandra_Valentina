package spital.fabrici;

import spital.clase.Personal;

public interface PersonalFabrica {
    public Personal getpersonal(TipPersonal tipPersonal, int id, String nume, int schimb);
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume);
}
