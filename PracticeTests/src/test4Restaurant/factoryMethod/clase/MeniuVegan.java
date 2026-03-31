package test4Restaurant.factoryMethod.clase;

public class MeniuVegan implements IMeniu {
    @Override
    public void afisareIngrediente() {
        StringBuilder sb=new StringBuilder();
        sb.append("Meniul vegan contine salata verde si hummus.");
        System.out.println(sb.toString());
    }
}
