package chain.main;

import chain.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieSuccesor calatorieAutobuz=new CalatorieAutobuz();
        CalatorieSuccesor calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieSuccesor calatorieTramvai=new CalatorieTramvai();
        CalatorieSuccesor calatorieMetrou=new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println( calatorieTroleibuz.recomandareCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandareCalatorie(7));
        System.out.println(calatorieTroleibuz.recomandareCalatorie(12));
    }
}