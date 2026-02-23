package ro.ase.seminar1.animale;

public class Lion extends Animal {
    private int kg;

    public Lion(String name, int age, int kg) {
        super(name, age);
        this.kg = kg;
    }

    @Override
    public void eat(String mancare) {

    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Lion: ");
        buffer.append(super.toString());
        buffer.append("kg: ");
        buffer.append(this.kg);
        return buffer.toString();
    }
}
