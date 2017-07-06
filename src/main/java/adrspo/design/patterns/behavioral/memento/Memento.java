package adrspo.design.patterns.behavioral.memento;

public class Memento {

    private StringBuilder content;

    public Memento(StringBuilder content) {
        this.content = content;
    }

    public StringBuilder getContent() {
        return content;
    }

}
