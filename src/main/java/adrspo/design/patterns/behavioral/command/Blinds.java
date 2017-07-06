package adrspo.design.patterns.behavioral.command;

public class Blinds {

    private boolean covered;

    public void reveal() {
        covered = false;
    }

    public void cover() {
        covered = true;
    }

    public boolean isCovered() {
        return covered;
    }

    @Override
    public String toString() {
        return "Blinds [covered=" + covered + "]";
    }

}
