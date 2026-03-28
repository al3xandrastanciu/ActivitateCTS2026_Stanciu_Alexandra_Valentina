package banca.clase.factory;

import banca.clase.carduri.CardCredit;
import banca.clase.carduri.CardDebit;
import banca.clase.carduri.CardEconomii;
import banca.clase.carduri.ConturiBancare;

public class FactoryCard {
    public ConturiBancare getCont(TipCard tip, String destinatar, double suma){
        switch (tip){
            case CARD_DEBIT -> {
                return new CardDebit(destinatar,suma);
            }
            case CARD_CREDIT -> {
                return new CardCredit(destinatar,suma);
            }
            case CARD_ECONOMII -> {
                return new CardEconomii(destinatar,suma);
            }
            default -> {
                return null;
            }
        }
    }
}
