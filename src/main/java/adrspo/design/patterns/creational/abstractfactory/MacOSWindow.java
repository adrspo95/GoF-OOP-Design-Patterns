package adrspo.design.patterns.creational.abstractfactory;

public class MacOSWindow extends Window {

    @Override
    public void display() {
        System.out.println("Wyswietlenie okna typu Mac OS o rozmiarze: X - " + getSizeX() +
                ", Y - " + getSizeY());
    }

    @Override
    public void close() {
        System.out.println("Zamykanie okna typu Mac OS");
    }

}
