package adrspo.design.patterns.behavioral.command;

public class BlindsCover implements Command {

    Blinds blinds;

    public BlindsCover(Blinds blinds) {
        super();
        this.blinds = blinds;
    }


    public Blinds getBlinds() {
        return blinds;
    }

    public void setBlinds(Blinds blinds) {
        this.blinds = blinds;
    }

    @Override
    public void execute() {
        blinds.cover();
    }

}
