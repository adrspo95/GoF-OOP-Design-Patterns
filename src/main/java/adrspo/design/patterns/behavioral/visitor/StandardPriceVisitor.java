package adrspo.design.patterns.behavioral.visitor;

public class StandardPriceVisitor implements Visitor {

    @Override
    public int visit(Book book) {
        return book.getPrice();
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPrice() * fruit.getKilograms();
    }

    @Override
    public int visit(Plate plate) {
        return plate.getPrice() * plate.getAmount();
    }

    @Override
    public int visit(MemoryCard card) {
        return card.getPrice();
    }

}
