package adrspo.design.patterns.behavioral.command;

public class LightOff implements Command {

    Light light;

    public LightOff(Light light) {
        super();
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
        light.swichOff();
    }

}
