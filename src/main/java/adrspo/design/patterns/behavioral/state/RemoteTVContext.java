package adrspo.design.patterns.behavioral.state;

public class RemoteTVContext implements State {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        state.execute();
    }


}
