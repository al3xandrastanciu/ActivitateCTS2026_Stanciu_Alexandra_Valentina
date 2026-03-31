package test2Service.prototype.main;

import test2Service.prototype.clase.Sticker;

public class Main {
    public static void main(String[] args) {
        Sticker sticker=new Sticker("Skoda", 2009);
        System.out.println(sticker);
        Sticker sticker1=(Sticker) sticker.copiaza();
        System.out.println(sticker1);
        Sticker sticker2=(Sticker) sticker.copiaza();
        sticker2.setModelMasina("Volvo");
        System.out.println(sticker2);

    }
}
