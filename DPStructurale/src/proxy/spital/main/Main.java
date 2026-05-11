package proxy.spital.main;

import proxy.spital.clase.ISpital;
import proxy.spital.clase.Pacient;
import proxy.spital.clase.Spital;
import proxy.spital.proxy.Proxy;

public class Main {
    static void main(String[] args) {
        Pacient pacient=new Pacient("Ioana", true);
        Pacient pacient1=new Pacient("Ion", false);

        Spital spital=new Spital("Municipal");
        spital.interneaza(pacient);

        Proxy proxy=new Proxy(spital);
        proxy.interneaza(pacient);
        proxy.interneaza(pacient1);
    }
}
