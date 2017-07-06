package adrspo.design.patterns.behavioral.state;

public class VolumeUpTVState implements State {

    @Override
    public void execute() {
        System.out.println("Volume up TV");
    }

}
