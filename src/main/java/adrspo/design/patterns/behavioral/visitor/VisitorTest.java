package adrspo.design.patterns.behavioral.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        Book book = new Book(30, "Java: The Complete Reference", "Herbert Schildt");
        Plate plates = new Plate(5, "porcelain, small", 10);
        MemoryCard card = new MemoryCard(20, "Samsung 8GB", "microSD");

        Visitor visitor = new StandardPriceVisitor();
        System.out.println("Standard prices: ");
        System.out.println("Book: " + book.accept(visitor));
        System.out.println("10 plates: " + plates.accept(visitor));
        System.out.println("Memory card: " + card.accept(visitor));

        visitor = new DiscountPriceVisitor(10);
        System.out.println("Prices after 10% discount: ");
        System.out.println("Book: " + book.accept(visitor));
        System.out.println("10 plates: " + plates.accept(visitor));
        System.out.println("Memory card: " + card.accept(visitor));

    }

}
