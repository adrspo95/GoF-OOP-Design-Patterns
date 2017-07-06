package adrspo.design.patterns.behavioral.visitor;

public interface Visitor {

    int visit(Book book);

    int visit(Fruit fruit);

    int visit(Plate plate);

    int visit(MemoryCard card);
}
