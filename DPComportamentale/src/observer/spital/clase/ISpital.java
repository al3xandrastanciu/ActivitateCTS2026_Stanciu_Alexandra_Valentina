package observer.spital.clase;

import strategy.spital.clase.Pacient;

public interface ISpital {
    void abonarePacient(IPacient pacient);
    void trimiteNotificare(String mesaj);
    void dezabonarePacient(IPacient pacient);
}
