package adrspo.design.patterns.structural.proxy;

public class ProxyTest {

    public static void main(String atgs[]) {
        ProxyImage image = new ProxyImage("pictrue12.jpg");

        image.display();
        image.display();

        image.setFilename("red_apple.png");
        image.display();
        image.display();
    }
}
