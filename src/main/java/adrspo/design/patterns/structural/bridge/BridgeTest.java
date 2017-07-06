package adrspo.design.patterns.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        OSRuntime osRuntime = new WindowsOSRuntime(new LinuxOSComponents());

        osRuntime.drawDialog();
        osRuntime.drawTextArea();
        osRuntime.drawButton();

        System.out.println();

        osRuntime = new LinuxOSRuntime(new WindowsOSComponents());

        osRuntime.drawDialog();
        osRuntime.drawTextArea();
        osRuntime.drawButton();

    }

}
