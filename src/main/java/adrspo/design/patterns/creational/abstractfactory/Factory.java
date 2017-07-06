package adrspo.design.patterns.creational.abstractfactory;

public interface Factory {

    Button createButton();

    CheckBox createCheckBox();

    Dialog createDialog();

    Window createWindow();
}
