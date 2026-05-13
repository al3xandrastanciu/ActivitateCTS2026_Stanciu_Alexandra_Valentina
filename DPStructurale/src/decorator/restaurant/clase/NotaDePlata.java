package decorator.restaurant.clase;

public class NotaDePlata implements INota{
    private double suma;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("S-a printat nota in valoare de "+this.suma);
    }
}
