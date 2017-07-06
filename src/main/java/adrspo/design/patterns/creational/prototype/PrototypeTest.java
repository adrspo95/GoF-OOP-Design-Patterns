package adrspo.design.patterns.creational.prototype;

import java.util.List;

public class PrototypeTest {
    public static void main(String args[]) {
        Volkswagen volkswagen = new Volkswagen();
        System.out.println("Orginal Volkswagen");
        System.out.println(volkswagen);

        Volkswagen copyOfVolkswagen = null;
        try {

            copyOfVolkswagen = (Volkswagen) volkswagen.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Volkswagen copy");
        System.out.println(copyOfVolkswagen + "\n\n");

        Engine engine = new Engine();
        engine.setCapacity(1.4);
        engine.setFuelType("LNG");

        copyOfVolkswagen.setEngine(engine);
        copyOfVolkswagen.setModel("Polo");
        List<String> copiedEquipment = copyOfVolkswagen.getEquipment();

        copiedEquipment.add("Electric windows");
        copiedEquipment.set(0, "Central lock");

        System.out.println("Orginal Volkswagen");
        System.out.println(volkswagen);

        System.out.println("Volkswagen Copy");
        System.out.println(copyOfVolkswagen + "\n\n");


    }
}
