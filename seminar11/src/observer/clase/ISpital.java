package observer.clase;

public interface ISpital {
    void trimiteNotificare(String notificare);
    void aboneazaPacient(Pacient pacient);
    void dezaboneazaPacient(Pacient pacient);
}
