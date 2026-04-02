package registry.clase;

public class Main {
    public static void main(String[] args) {
        IEchipament boxa=new Boxa();
        IEchipament proiector=new Proiector();
        IEchipament cablu=new CabluInternet();
        IEchipament boxa2=new Boxa();
        try{
            EchipamentRegistry.register("Boxa1", boxa);
            IEchipament e1 = EchipamentRegistry.getEchipament("Boxa1");
            e1.afisareStare();

            EchipamentRegistry.register("Boxa1", boxa2);
            IEchipament e2 = EchipamentRegistry.getEchipament("Boxa2");
            e2.afisareStare();
            e2.afisareStare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
