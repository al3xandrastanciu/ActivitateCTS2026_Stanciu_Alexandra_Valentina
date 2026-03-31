package test4Restaurant.factoryMethod.clase;

public class MeniuCarnivor implements IMeniu{
    @Override
    public void afisareIngrediente() {
        StringBuilder sb=new StringBuilder();
        sb.append("Meniul carnivor contine friptura la cuptor.");
        System.out.println(sb.toString());
    }
}
