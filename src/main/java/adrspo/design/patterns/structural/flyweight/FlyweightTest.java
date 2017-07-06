package adrspo.design.patterns.structural.flyweight;

public class FlyweightTest {

    public static void main(String args[]) {

        for (int i = 0; i < 100; i++) {
            Shape shape;
            if (i % 2 == 0) shape = ShapeFactory.getCircle(randomSize());
            else shape = ShapeFactory.getSquare(randomSize());
            shape.display();
        }
    }

    private static String randomSize() {
        int randomInt = (int) (Math.random() * 100);

        if (randomInt < 34) return Shape.Size.SMALL;
        if (randomInt < 68) return Shape.Size.MEDIUM;
        return Shape.Size.BIG;
    }
}


