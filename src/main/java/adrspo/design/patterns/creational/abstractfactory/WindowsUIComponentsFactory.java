package adrspo.design.patterns.creational.abstractfactory;

public class WindowsUIComponentsFactory implements Factory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

}
