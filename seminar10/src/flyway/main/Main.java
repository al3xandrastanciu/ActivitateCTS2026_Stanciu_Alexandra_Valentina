package flyway.main;

import flyway.clase.Client;
import flyway.clase.ClientAbstract;
import flyway.clase.RegistruClienti;
import flyway.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registruClienti=new RegistruClienti();
        ClientAbstract client=new Client("Ana", "0735136386", "ana@gmail.com");
        ClientAbstract client1=new Client("Maria", "0712345678", "maria@gmail.com");
        Rezervare rezervare=new Rezervare(3, 5, "13:00");
        Rezervare rezervare1=new Rezervare(5, 2, "18:00");
        client.printeazaRezervare(rezervare);
        client.plateste(rezervare, 12);
        client1.printeazaRezervare(rezervare1);
        client1.plateste(rezervare1, 50);
        registruClienti.getClient("Ioana", "0735136386", "ioana@email.com").printeazaRezervare(rezervare);
        registruClienti.getClient("Ioana", "0735136386", "ioana@email.com").plateste(rezervare, 13);
        Rezervare rezervare2=new Rezervare(3, 2, "20:00");
        registruClienti.getClient("Ioana", "0735136386", "ioana@email.com").printeazaRezervare(rezervare2);
        registruClienti.getClient("Ioana", "0735136386", "ioana@email.com").plateste(rezervare2,15);
    }
}