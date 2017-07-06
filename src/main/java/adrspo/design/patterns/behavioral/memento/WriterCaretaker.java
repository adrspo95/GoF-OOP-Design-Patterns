package adrspo.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class WriterCaretaker {

    private List<Memento> states = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        states.add(memento);
    }

    public Memento getMemento(int index) {
        return states.get(index);
    }
}
