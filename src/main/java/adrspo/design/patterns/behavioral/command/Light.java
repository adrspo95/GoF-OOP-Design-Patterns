package adrspo.design.patterns.behavioral.command;

public class Light {

    boolean on;

    public void switchOn() {
        on = true;
    }

    public void swichOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return "Light [on=" + on + "]";
    }

}
