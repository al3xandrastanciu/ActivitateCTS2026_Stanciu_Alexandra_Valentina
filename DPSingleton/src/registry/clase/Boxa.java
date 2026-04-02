package registry.clase;

public class Boxa implements IEchipament{
    @Override
    public void afisareStare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Boxa este activa");
        System.out.println(sb.toString());
    }
}
