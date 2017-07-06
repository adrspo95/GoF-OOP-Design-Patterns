package adrspo.design.patterns.creational.abstractfactory;

public class WindowsDialog extends Dialog {

    @Override
    public void display() {
        System.out.println("Wyswietlenie dialogu typu Mac OS o tytule - " + getTitle() +
                "i tresci - " + getContent());
    }

}
