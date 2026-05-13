package decorator.restaurant.clase.decorator;

import decorator.restaurant.clase.INota;

public class NotaAnNou extends NotaDePlataDecorator{
    public NotaAnNou(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani");
    }
}
