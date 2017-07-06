package adrspo.design.patterns.structural.proxy;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        super();
        this.filename = filename;
        loadFromDisk();
    }

    public void setFilename(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

}
