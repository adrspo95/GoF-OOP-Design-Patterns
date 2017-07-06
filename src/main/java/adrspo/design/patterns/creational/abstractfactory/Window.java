package adrspo.design.patterns.creational.abstractfactory;

public abstract class Window {

    private int sizeX;
    private int sizeY;

    public abstract void display();

    public abstract void close();

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }


}
