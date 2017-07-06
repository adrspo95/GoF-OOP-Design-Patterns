package adrspo.design.patterns.behavioral.command;

public class CommandTest {

    public static void main(String[] args) {
        Blinds blinds1 = new Blinds();
        Blinds blinds2 = new Blinds();
        Light light = new Light();

        BlindsCover blindsCover = new BlindsCover(blinds1);
        BlindsReveal blidsReveal = new BlindsReveal(blinds2);
        LightOn lightOn = new LightOn(light);

        RemoteControl remoteControl = new RemoteControl(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(blindsCover);
        remoteControl.pressButton();
        remoteControl.setCommand(blidsReveal);
        remoteControl.pressButton();

        System.out.println(light);
        System.out.println(blinds1);
        System.out.println(blinds2);

    }

}
