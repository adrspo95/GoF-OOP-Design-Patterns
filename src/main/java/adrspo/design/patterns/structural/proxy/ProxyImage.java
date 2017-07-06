package adrspo.design.patterns.structural.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
        realImage = new RealImage(filename);
    }

    public void setFilename(String filename) {
        this.filename = filename;
        realImage.setFilename(filename);
    }

    @Override
    public void display() {
        realImage.display();
    }

}
