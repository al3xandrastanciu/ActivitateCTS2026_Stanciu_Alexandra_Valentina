package chainOfResponsability.restaurant.clase;

public class Client {
    private String tel;
    private String mail;

    public Client(String tel, String mail) {
        this.tel = tel;
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }
}
