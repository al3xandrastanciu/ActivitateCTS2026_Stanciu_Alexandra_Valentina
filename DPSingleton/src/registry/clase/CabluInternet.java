package registry.clase;

public class CabluInternet implements IEchipament{
    @Override
    public void afisareStare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Cablu internet este activ");
        System.out.println(sb.toString());
    }
}
