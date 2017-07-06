package adrspo.design.patterns.behavioral.mediator;

public class Auction implements Colleague {

    private double price;

    public Auction(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        Mediator.getInstance().changed(this);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void update(Colleague colleague) {
    }

}
