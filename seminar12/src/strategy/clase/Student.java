package strategy.clase;

public class Student {
    private String nume;
    private ModSustinereExamen modSustinereExamen;

    public Student(ModSustinereExamen modSustinereExamenn) {
        this.modSustinereExamen = modSustinereExamen;

    }

    public Student (String nume) {
        this.modSustinereExamen= new Grila();
        this.nume=nume;
    }

    public void setModSustinereExamen(ModSustinereExamen modSustinereExamen) {
        this.modSustinereExamen = modSustinereExamen;
    }

    public void examinare(){
        modSustinereExamen.sustinereExamen();
    }
}
