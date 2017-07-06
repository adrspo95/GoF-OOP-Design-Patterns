package adrspo.design.patterns.creational.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String args[]) {
        Factory osComponentsFactory = new LinuxUIComponentsFactory();

        LinuxDialog linuxDialog = (LinuxDialog) osComponentsFactory.createDialog();
        linuxDialog.setTitle("Notification");
        linuxDialog.setContent("This is sample window");

        LinuxWindow linuxWindow = (LinuxWindow) osComponentsFactory.createWindow();
        linuxWindow.display();

        linuxDialog.display();
        linuxWindow.close();

        osComponentsFactory = new WindowsUIComponentsFactory();

        WindowsButton windowsButton1 = (WindowsButton) osComponentsFactory.createButton();
        WindowsButton windowsButton2 = (WindowsButton) osComponentsFactory.createButton();

        windowsButton1.setSizeX(50);
        windowsButton1.setSizeY(10);
        windowsButton1.setName("Button 1");

        windowsButton2.setSizeX(80);
        windowsButton2.setSizeY(20);
        windowsButton2.setName("Button 2");

        WindowsWindow windowsWindow = (WindowsWindow) osComponentsFactory.createWindow();
        windowsWindow.display();

        osComponentsFactory = new MacOSUIComponentsFactory();

        MacOSCheckBox macOSCheckBox1 = (MacOSCheckBox) osComponentsFactory.createCheckBox();
        MacOSCheckBox macOSCheckBox2 = (MacOSCheckBox) osComponentsFactory.createCheckBox();
        MacOSCheckBox macOSCheckBox3 = (MacOSCheckBox) osComponentsFactory.createCheckBox();

        macOSCheckBox1.setChecked(true);
        macOSCheckBox2.setChecked(false);
        macOSCheckBox3.setChecked(false);
        macOSCheckBox1.setName("Yes");
        macOSCheckBox2.setName("No");
        macOSCheckBox3.setName("Remember my choice");

        MacOSButton macOSButton = (MacOSButton) osComponentsFactory.createButton();

        macOSButton.setName("Submit");

        MacOSDialog macOSDialog = (MacOSDialog) osComponentsFactory.createDialog();
        macOSDialog.setTitle("System");
        macOSDialog.setContent("Do you want to remove the file?");
        macOSDialog.display();

    }


}
