package adrspo.design.patterns.behavioral.templatemethod;

public class CircleDrawer extends ShapeDrawer {

    @Override
    void drawShape() {
        System.out.println("Drawing circle...");
    }

}
