package adrspo.design.patterns.creational.abstractfactory;

public class LinuxWindow extends Window {

    @Override
    public void display() {
        System.out.println("Rendering Linux window with size: X - " + getSizeX() +
                ", Y - " + getSizeY());
    }

    @Override
    public void close() {
        System.out.println("Closing Linux window");
    }

}
