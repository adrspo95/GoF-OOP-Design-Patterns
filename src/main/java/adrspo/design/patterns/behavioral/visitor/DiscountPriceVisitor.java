package adrspo.design.patterns.behavioral.visitor;

public class DiscountPriceVisitor implements Visitor {

    private int discount;
    private double precentagePrice;

    public DiscountPriceVisitor(int discount) {
        super();
        this.discount = discount;

        precentagePrice = 1 - ((double) discount / 100);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;

        precentagePrice = 1 - ((double) discount / 100);
    }

    @Override
    public int visit(Book book) {
        return (int) (precentagePrice * book.getPrice());
    }

    @Override
    public int visit(Fruit fruit) {
        return (int) (precentagePrice * fruit.getPrice() * fruit.getKilograms());
    }

    @Override
    public int visit(Plate plate) {
        return (int) (precentagePrice * plate.getPrice() * plate.getAmount());
    }

    @Override
    public int visit(MemoryCard card) {
        return (int) (precentagePrice * card.getPrice());
    }

}
