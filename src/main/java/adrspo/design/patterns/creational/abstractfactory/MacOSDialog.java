package adrspo.design.patterns.creational.abstractfactory;

public class MacOSDialog extends Dialog {

    @Override
    public void display() {
        System.out.println("Rendering MacOS dialog with title - " + getTitle() +
                "and content - " + getContent());
    }

}
