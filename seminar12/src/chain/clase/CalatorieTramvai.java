package chain.clase;

public class CalatorieTramvai extends CalatorieSuccesor {
    @Override
    public void setCalatorieHandler(CalatorieSuccesor calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    public CalatorieTramvai() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if(distanta>5 && distanta<10){
            return "Tramvai";
        }

        return super.calatorieHandler.recomandareCalatorie(distanta);

    }
}
