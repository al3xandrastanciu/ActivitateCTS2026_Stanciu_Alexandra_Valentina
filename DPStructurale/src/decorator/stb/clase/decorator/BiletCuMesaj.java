package decorator.stb.clase.decorator;

import decorator.stb.clase.IBilet;

public class BiletCuMesaj extends DecoratorBilet{
    public BiletCuMesaj(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesaj() {
        System.out.println("La multi ani!");
    }
}
