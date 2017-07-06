package adrspo.design.patterns.behavioral.templatemethod;

public abstract class ShapeDrawer {

    abstract void drawShape();

    public final void draw() {
        System.out.println("Opening paint");

        drawShape();

        System.out.println("Saving file");
    }

}
