package decorator.main;

import decorator.clase.INotaDePlata;
import decorator.clase.NotaDePlata;
import decorator.clase.decorator.NotaDePlata1Mai;
import decorator.clase.decorator.NotaDePlataDecorator;
import decorator.clase.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata=new NotaDePlata(45, "12.03.2026");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataDecorator=new NotaDePlataNoulAn(notaDePlata);
        NotaDePlataDecorator nota2=new NotaDePlata1Mai(notaDePlata);
        int a=2;
        if(a==1){
            notaDePlataDecorator.printeazaFelicitare();
        }
        else if(a==2){
            nota2.printeazaFelicitare();
        }
    }
}