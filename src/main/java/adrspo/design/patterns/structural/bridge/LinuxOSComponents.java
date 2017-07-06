package adrspo.design.patterns.structural.bridge;

public class LinuxOSComponents implements OSComponents {

    @Override
    public void displayButton() {
        System.out.println("Displaying Linux style button");
    }

    @Override
    public void displayDialog() {
        System.out.println("Displaying Linux style dialog");
    }

    @Override
    public void displayTextArea() {
        System.out.println("Displaying Linux style text area");
    }
}
