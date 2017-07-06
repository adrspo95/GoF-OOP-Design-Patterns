package adrspo.design.patterns.behavioral.visitor;

public class Plate extends Item {

    private int amount;

    public Plate(int price, String name, int amount) {
        super(price, name);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
