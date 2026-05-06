package strategy.main;

import strategy.clase.PobaOrala;
import strategy.clase.ProbaScrisa;
import strategy.clase.Student;

public class Main {
    static void main() {
        Student student=new Student("Ana");
        student.examinare();

        student.setModSustinereExamen(new PobaOrala());
        student.examinare();
        student.setModSustinereExamen(new ProbaScrisa());
        student.examinare();
    }
}
