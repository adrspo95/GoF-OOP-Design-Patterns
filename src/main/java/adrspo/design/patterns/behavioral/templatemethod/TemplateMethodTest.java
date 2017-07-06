package adrspo.design.patterns.behavioral.templatemethod;

public class TemplateMethodTest {

    public static void main(String args[]) {
        ShapeDrawer shapeDrawer = new TriangleDrawer();
        shapeDrawer.draw();

        shapeDrawer = new CircleDrawer();
        shapeDrawer.draw();

        shapeDrawer = new RectangleDrawer();
        shapeDrawer.draw();
    }

}
