package chain.clase;

public abstract class CalatorieSuccesor {
    protected CalatorieSuccesor calatorieHandler;

    public void setCalatorieHandler(CalatorieSuccesor calatorieHandler) {
        this.calatorieHandler = calatorieHandler;
    }

    public CalatorieSuccesor() {
        this.calatorieHandler = null;
    }

    public abstract String recomandareCalatorie(double distanta);
}
