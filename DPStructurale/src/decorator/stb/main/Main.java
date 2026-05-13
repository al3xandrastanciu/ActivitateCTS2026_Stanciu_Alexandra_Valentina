package decorator.stb.main;

import decorator.stb.clase.Bilet;
import decorator.stb.clase.IBilet;
import decorator.stb.clase.decorator.BiletCuMesaj;
import decorator.stb.clase.decorator.DecoratorBilet;

public class Main {
    static void main(String[] args) {
        IBilet bilet=new Bilet("Unirii");
        bilet.printeazaBilet();

        DecoratorBilet decoratorBilet=new BiletCuMesaj(bilet);
        decoratorBilet.printeazaMesaj();
    }
}
