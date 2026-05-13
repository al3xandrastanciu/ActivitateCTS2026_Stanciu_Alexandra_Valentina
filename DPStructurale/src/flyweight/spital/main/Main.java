package flyweight.spital.main;

import flyweight.spital.clase.IPacient;
import flyweight.spital.clase.Pacient;
import flyweight.spital.clase.RegistruPacienti;
import flyweight.spital.clase.Salon;

public class Main {
    static void main(String[] args) {
        RegistruPacienti registruPacienti=new RegistruPacienti();

        IPacient pacient=new Pacient("Ana", "0723456362", "str 1");
        IPacient pacient1=new Pacient("Maria","0743729053", "str 2");

        Salon salon=new Salon(2, 6, 10);
        Salon salon1=new Salon(2, 1, 6);

        pacient.arataDetaliiInternare(salon);
        pacient1.arataDetaliiInternare(salon1);

        registruPacienti.getPacient("Elena", "0723456362", "str 1").arataDetaliiInternare(salon);
    }
}
