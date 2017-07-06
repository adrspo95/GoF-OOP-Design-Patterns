package adrspo.design.patterns.behavioral.templatemethod;

public class RectangleDrawer extends ShapeDrawer {

    @Override
    void drawShape() {
        System.out.println("Drawing Rectangle...");
    }

}
