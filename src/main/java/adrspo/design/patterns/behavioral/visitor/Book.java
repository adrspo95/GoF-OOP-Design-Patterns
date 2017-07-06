package adrspo.design.patterns.behavioral.visitor;

public class Book extends Item {

    private String author;

    public Book(int price, String name, String author) {
        super(price, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
