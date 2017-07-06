package adrspo.design.patterns.structural.bridge;

public class WindowsOSComponents implements OSComponents {

    @Override
    public void displayButton() {
        System.out.println("Displaying Windows style button");
    }

    @Override
    public void displayDialog() {
        System.out.println("Displaying Windows style dialog");
    }

    @Override
    public void displayTextArea() {
        System.out.println("Displaying Windows style text area");
    }

}
