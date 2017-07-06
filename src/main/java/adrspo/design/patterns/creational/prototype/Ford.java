package adrspo.design.patterns.creational.prototype;

import java.util.ArrayList;

public class Ford extends Car {

    public Ford() {
        setMake("Ford");
        setModel("Fiesta");

        setEngine(new Engine() {{
            setCapacity(1.8);
            setFuelType("petrol");
        }});

        setEquipment(new ArrayList<String>() {{
            add("ABS");
            add("Air Bag x4");
            add("Immobiliser");
        }});
    }
}
