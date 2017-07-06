package adrspo.design.patterns.behavioral.visitor;

public abstract class Item {

    private int price;
    private String name;

    public abstract int accept(Visitor visitor);

    protected Item(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
