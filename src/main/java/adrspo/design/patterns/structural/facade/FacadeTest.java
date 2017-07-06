package adrspo.design.patterns.structural.facade;

public class FacadeTest {

    public static void main(String args[]) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawTriangle();
    }

}
