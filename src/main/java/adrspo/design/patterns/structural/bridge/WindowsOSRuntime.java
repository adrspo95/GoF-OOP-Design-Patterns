package adrspo.design.patterns.structural.bridge;

public class WindowsOSRuntime extends OSRuntime {

    public WindowsOSRuntime(OSComponents osComponents) {
        super(osComponents, "Windows");
    }

    @Override
    public void drawButton() {
        System.out.print("Windows: ");
        osComponents.displayButton();
    }

    @Override
    public void drawDialog() {
        System.out.print("Windows: ");
        osComponents.displayDialog();
    }

    @Override
    public void drawTextArea() {
        System.out.print("Windows: ");
        osComponents.displayTextArea();
    }

}
