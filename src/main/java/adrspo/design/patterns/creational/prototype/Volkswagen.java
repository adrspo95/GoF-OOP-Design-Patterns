package adrspo.design.patterns.creational.prototype;

import java.util.ArrayList;

public class Volkswagen extends Car {
    public Volkswagen() {
        setMake("Volkswagen");
        setModel("Passat");

        setEngine(new Engine() {{
            setCapacity(1.2);
            setFuelType("diesel");
        }});

        setEquipment(new ArrayList<String>() {{
            add("ABS");
            add("Air Bag x2");
            add("Immobiliser");
            add("CD");
            add("Radio");
            add("Alarm");
        }});
    }
}
