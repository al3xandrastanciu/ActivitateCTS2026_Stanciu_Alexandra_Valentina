package flyweight.stb.main;

import flyweight.stb.clase.Autobuz;
import flyweight.stb.clase.IAutobuz;
import flyweight.stb.clase.Linie;
import flyweight.stb.clase.RegistruAutobuze;

public class Main {
    static void main(String[] args) {
        RegistruAutobuze autobuze=new RegistruAutobuze();

        IAutobuz autobuz=new Autobuz("Mercedes", 2010, 30, "B 100 AAA");
        IAutobuz autobuz1=new Autobuz("MAN", 2015, 45, "B 12 RHM");
        Linie linie=new Linie(123, "Obor", "Colentina");
        Linie linie1=new Linie(12, "Victoriei", "Romana");

        autobuz1.arataLinie(linie1);
        autobuz.arataLinie(linie);

        autobuze.getAutobuz("nustiu", 2009, 30, "B 100 AAA").arataLinie(linie);
    }
}
