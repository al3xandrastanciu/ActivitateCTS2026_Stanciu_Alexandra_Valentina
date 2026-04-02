package prototype.clase;

import com.sun.source.tree.AnnotationTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> antrenamente=new ArrayList<String>();
        List<String> medicamente=new ArrayList<String>();
        antrenamente.add("forta");
        antrenamente.add("incalzire");
        medicamente.add("nurofen");

        Jucator jucator=new Jucator("Andrei", "Fundas", antrenamente, medicamente);
        System.out.println(jucator);
        Jucator jucator1=(Jucator) jucator.copiaza();
        jucator1.setNume("Ionut");
        jucator1.setPozitie("Portar");
        System.out.println(jucator1);
    }
}
