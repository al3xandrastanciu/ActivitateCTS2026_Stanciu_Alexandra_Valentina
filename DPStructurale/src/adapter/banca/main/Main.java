package adapter.banca.main;

import adapter.banca.clase.softVechi.Adapterleasing;
import adapter.banca.clase.softVechi.Framework;
import adapter.banca.clase.softVechi.FrameworkLeasing;

public class Main {
    public static void oferaCredit(Framework framework, String date){
        framework.oferaCredit(date);
    }

    static void main(String[] args) {
        Framework framework=new Framework();
        framework.oferaCredit("crdit ipotecar");
        FrameworkLeasing frameworkLeasing=new FrameworkLeasing();
        Adapterleasing adapterleasing=new Adapterleasing(framework);
        adapterleasing.oferaCreditleasing("leasing");
    }
}
