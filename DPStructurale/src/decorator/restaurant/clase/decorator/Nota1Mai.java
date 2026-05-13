package decorator.restaurant.clase.decorator;

import decorator.restaurant.clase.INota;

public class Nota1Mai extends NotaDePlataDecorator {
    public Nota1Mai(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai");
    }
}
