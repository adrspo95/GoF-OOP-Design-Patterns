package adrspo.design.patterns.behavioral.state;

public class VolumeDownTVState implements State {

    @Override
    public void execute() {
        System.out.println("Volum down TV");
    }

}
