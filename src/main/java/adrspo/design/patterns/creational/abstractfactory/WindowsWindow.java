package adrspo.design.patterns.creational.abstractfactory;

public class WindowsWindow extends Window {

    @Override
    public void display() {
        System.out.println("Wyswietlenie okna typu Windows o rozmiarze: X - " + getSizeX() +
                ", Y - " + getSizeY());
    }

    @Override
    public void close() {
        System.out.println("Zamykanie okna typu Windows");
    }

}
