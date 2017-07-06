package adrspo.design.patterns.structural.flyweight;

public class Square extends Shape {

    public Square(String size) {
        super(size, "Square");
    }

    @Override
    void display() {
        System.out.println("Displaying square of " + getSize() + " size...");
    }

}
