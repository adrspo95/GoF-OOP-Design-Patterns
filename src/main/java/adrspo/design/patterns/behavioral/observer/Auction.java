package adrspo.design.patterns.behavioral.observer;

import java.util.Observable;

public class Auction extends Observable {

    private double price;

    public Auction(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;

        setChanged();
        notifyObservers(price);
    }
}
