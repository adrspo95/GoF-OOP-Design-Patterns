package adrspo.design.patterns.creational.abstractfactory;

public abstract class CheckBox {

    private boolean checked;
    private String name;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
