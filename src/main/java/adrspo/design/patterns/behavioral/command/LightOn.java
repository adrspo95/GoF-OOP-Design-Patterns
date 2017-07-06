package adrspo.design.patterns.behavioral.command;

public class LightOn implements Command {

    Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

}
