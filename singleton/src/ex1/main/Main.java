package ex1.main;

import ex1.clase.DataBaseConnection;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection instace=DataBaseConnection.getInstance("jdbc:mysql://localhost:3306/stb_db", "admin123");
        instace.executeQuery("SELECT * from Customers;");


    }
}