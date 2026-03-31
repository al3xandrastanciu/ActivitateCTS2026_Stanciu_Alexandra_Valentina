package test4Restaurant.factoryMethod.clase;

public class MeniuVegetarian implements IMeniu{
    @Override
    public void afisareIngrediente() {
        StringBuilder sb=new StringBuilder();
        sb.append("Meniul vegetarian contine supa crema de legume si tocanita de legume.");
        System.out.println(sb.toString());
    }
}
