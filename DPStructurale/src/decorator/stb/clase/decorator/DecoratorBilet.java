package decorator.stb.clase.decorator;

import decorator.stb.clase.IBilet;

public abstract class DecoratorBilet implements IBilet {
    private IBilet bilet;

    public DecoratorBilet(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
    }
    public abstract void printeazaMesaj();
}
