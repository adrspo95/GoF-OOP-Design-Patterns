package adrspo.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    private static List<Shape> shapes = new ArrayList<>();

    public static Circle getCircle(String size) {

        for (Shape shape : shapes)
            if (shape.getName().equals("Circle") && shape.getSize().equals(size)) return (Circle) shape;
        System.out.println();
        System.out.println("Creating circle of " + size + " size");
        System.out.println();
        Circle circle = new Circle(size);
        shapes.add(circle);

        return circle;
    }

    public static Square getSquare(String size) {

        for (Shape shape : shapes)
            if (shape.getName().equals("Square") && shape.getSize().equals(size)) return (Square) shape;

        System.out.println();
        System.out.println("Creating square of " + size + " size");
        System.out.println();
        Square square = new Square(size);
        shapes.add(square);

        return square;
    }

}
