package ro.ase.seminar4.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;

    private static Logger instanta = null; //lazy initialization



    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void afiseazaLog(String text){
        System.out.println("Loc cu ID: "+cod+" , efectuat de utilizatorul "+sender+" are textul "+text+" din categoria "+categorie);
        this.cod++;
    }

    public static synchronized Logger getInstanta(String sender, String categorie){//threadsafe singleton
        if(instanta==null){
            instanta=new Logger(sender, categorie);
        }
        return instanta;
    }
}
