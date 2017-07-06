package adrspo.design.patterns.behavioral.state;

public class SwitchOffTVState implements State {

    @Override
    public void execute() {
        System.out.println("Switch off TV");
    }

}
