package decorator.restaurant.main;

import decorator.restaurant.clase.INota;
import decorator.restaurant.clase.NotaDePlata;
import decorator.restaurant.clase.decorator.Nota1Mai;
import decorator.restaurant.clase.decorator.NotaAnNou;
import decorator.restaurant.clase.decorator.NotaDePlataDecorator;

public class Main {
    static void main(String[] args) {
        INota nota=new NotaDePlata(55);
        nota.printeaza();

        NotaDePlataDecorator notaDePlataDecorator=new Nota1Mai(nota);
        NotaDePlataDecorator notaDePlataDecorator1=new NotaAnNou(nota);

        notaDePlataDecorator1.printeazaFelicitare();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
