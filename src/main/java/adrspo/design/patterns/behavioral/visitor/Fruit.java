package adrspo.design.patterns.behavioral.visitor;

public class Fruit extends Item {

    private int kilograms;

    public Fruit(int price, String name, int kilograms) {
        super(price, name);
        this.kilograms = kilograms;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
