package decorator.restaurant.clase.decorator;

import decorator.restaurant.clase.INota;

public abstract class NotaDePlataDecorator implements INota {
    private INota nota;

    public NotaDePlataDecorator(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
    public abstract void printeazaFelicitare();
}
