package restaurant.clase.supe;

public class SupaLegume implements FelDeSupa{
    private float pret;
    private float gramaj;

    public SupaLegume(float pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public void afisareSupa() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de legume are pretul de ").append(this.pret).append(" si gramajul de ").append(this.gramaj).append(" grame.");
        System.out.println(sb.toString());
    }
}
