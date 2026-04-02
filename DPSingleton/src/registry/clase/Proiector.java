package registry.clase;

public class Proiector implements IEchipament{
    @Override
    public void afisareStare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Proiectorul este activ");
        System.out.println(sb.toString());
    }
}
