package stb.main;

import stb.clase.AutobuzLinie;
import stb.clase.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
       AutobuzLinieBuilder builder=new AutobuzLinieBuilder().setOpriri(true);
       AutobuzLinie autobuzLinie=builder.build("MAN", "Ion","Piata victoriei");
        System.out.println(autobuzLinie);
        AutobuzLinie autobuzLinie1=builder.build("MANN", "Mihai", "Obor");
        System.out.println(autobuzLinie1);
    }
}