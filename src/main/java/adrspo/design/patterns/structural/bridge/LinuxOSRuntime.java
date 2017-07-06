package adrspo.design.patterns.structural.bridge;

public class LinuxOSRuntime extends OSRuntime {

    public LinuxOSRuntime(OSComponents osComponents) {
        super(osComponents, "Linux");
    }

    @Override
    public void drawButton() {
        System.out.print("Linux: ");
        osComponents.displayButton();
    }

    @Override
    public void drawDialog() {
        System.out.print("Linux: ");
        osComponents.displayDialog();
    }

    @Override
    public void drawTextArea() {
        System.out.print("Linux: ");
        osComponents.displayTextArea();
    }

}
