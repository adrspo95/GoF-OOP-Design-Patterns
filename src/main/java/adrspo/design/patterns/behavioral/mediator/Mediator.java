package adrspo.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.HashMap;

public class Mediator {

    private static Mediator mediator = new Mediator();

    public static Mediator getInstance() {
        return mediator;
    }

    private Mediator() {
    }

    private static HashMap<Colleague, ArrayList<Colleague>> colleagues = new HashMap<Colleague, ArrayList<Colleague>>();

    public void add(Colleague informer, Colleague observator) {
        ArrayList<Colleague> observators = colleagues.get(informer);

        if (observators == null) {
            observators = new ArrayList<Colleague>();
            observators.add(observator);
            colleagues.put(informer, observators);
        } else {
            observators.add(observator);
        }
    }

    public void delete(Colleague informer, Colleague observer) {
        ArrayList<Colleague> observers = colleagues.get(informer);

        if (observers != null) observers.remove(observer);
    }

    public void changed(Colleague informer) {
        ArrayList<Colleague> observators = new ArrayList<Colleague>(colleagues.get(informer));

        for (Colleague colleague : observators)
            colleague.update(informer);
    }

}
