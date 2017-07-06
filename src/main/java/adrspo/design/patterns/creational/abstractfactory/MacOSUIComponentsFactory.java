package adrspo.design.patterns.creational.abstractfactory;

public class MacOSUIComponentsFactory implements Factory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

    @Override
    public Dialog createDialog() {
        return new MacOSDialog();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

}
