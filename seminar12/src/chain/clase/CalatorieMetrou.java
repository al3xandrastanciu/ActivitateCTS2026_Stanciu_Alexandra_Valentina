package chain.clase;

public class CalatorieMetrou extends CalatorieSuccesor {
    @Override
    public void setCalatorieHandler(CalatorieSuccesor calatorieHandler) {
        super.setCalatorieHandler(calatorieHandler);
    }

    public CalatorieMetrou() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
       return "Metrou";

    }
}
