package decorator.clase.decorator;

import decorator.clase.INotaDePlata;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{
    public NotaDePlataNoulAn(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
