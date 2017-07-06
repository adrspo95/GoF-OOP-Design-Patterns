package adrspo.design.patterns.creational.abstractfactory;

public class LinuxUIComponentsFactory implements Factory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }

    @Override
    public Dialog createDialog() {
        return new LinuxDialog();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

}
