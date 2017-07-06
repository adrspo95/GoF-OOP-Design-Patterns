package adrspo.design.patterns.structural.bridge;

public abstract class OSRuntime {

    private String os;
    protected OSComponents osComponents;

    public OSRuntime(OSComponents osComponents, String os) {
        this.osComponents = osComponents;
        this.os = os;

        System.out.println("Preparing " + osComponents.getClass().getSimpleName() + " on " + os + " environment");
    }

    abstract void drawButton();

    abstract void drawDialog();

    abstract void drawTextArea();
}
