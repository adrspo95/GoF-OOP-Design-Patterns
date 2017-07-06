package adrspo.design.patterns.behavioral.state;

public class StateTest {

    public static void main(String args[]) {

        RemoteTVContext remoteController = new RemoteTVContext();

        remoteController.setState(new SwitchOnTVState());

        remoteController.execute();

        remoteController.setState(new SwitchUpTVProgramState());

        remoteController.execute();
        remoteController.execute();
        remoteController.execute();

        remoteController.setState(new VolumeUpTVState());

        remoteController.execute();

        remoteController.setState(new SwitchOffTVState());

        remoteController.execute();
    }
}
