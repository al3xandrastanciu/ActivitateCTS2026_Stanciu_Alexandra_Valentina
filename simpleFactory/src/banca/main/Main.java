package banca.main;

import banca.clase.carduri.ConturiBancare;
import banca.clase.factory.FactoryCard;
import banca.clase.factory.TipCard;

public class Main {
    public static void main(String[] args) {
        FactoryCard factory=new FactoryCard();
        ConturiBancare contDebit=factory.getCont(TipCard.CARD_DEBIT,"Ion",560.8);
        contDebit.afisareCard();
    }
}
