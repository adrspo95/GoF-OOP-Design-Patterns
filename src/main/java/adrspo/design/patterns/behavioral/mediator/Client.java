package adrspo.design.patterns.behavioral.mediator;

public class Client implements Colleague {

    private final String name;
    private double maxPrice;

    public Client(String name, double maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    @Override
    public void update(Colleague colleague) {

        if (colleague instanceof Auction) {
            double currentPrice = ((Auction) colleague).getPrice();
            System.out.println(name + ": I was notyfied about price " + currentPrice);

            if (maxPrice < currentPrice) {
                System.out.println(name + ": I withraw from the auction");
                Mediator.getInstance().delete(colleague, this);
            }
        }
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

}
