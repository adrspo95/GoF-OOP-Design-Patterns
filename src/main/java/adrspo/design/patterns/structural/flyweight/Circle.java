package adrspo.design.patterns.structural.flyweight;

public class Circle extends Shape {

    public Circle(String size) {
        super(size, "Circle");
    }

    @Override
    void display() {
        System.out.println("Displaying circle of " + getSize() + " size...");
    }

}
