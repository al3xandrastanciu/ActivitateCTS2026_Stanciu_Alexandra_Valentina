package ex1.clase;

public class DataBaseConnection {
    private String url;
    private String username;

    private static DataBaseConnection instance = null;

    private DataBaseConnection(String url, String username) {
        this.url = url;
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void executeQuery(String query){
        StringBuilder sb=new StringBuilder();
        sb.append("Executing query: ").append(query).append("on database with url: ").append(this.url);
        sb.append("Query executed by user: ").append(this.username);
        System.out.println(sb.toString());
    }


    public static synchronized DataBaseConnection getInstance(String url, String username){
        if(instance==null){
            instance=new DataBaseConnection(url, username);
        }
        return instance;
    }
}
