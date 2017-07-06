package adrspo.design.patterns.creational.abstractfactory;

public class LinuxDialog extends Dialog {

    @Override
    public void display() {
        System.out.println("Rendering Linux dialog with title - " + getTitle() +
                " and content - " + getContent());
    }

}
