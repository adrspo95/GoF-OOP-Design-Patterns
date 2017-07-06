package adrspo.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {

    private String model;
    private String make;
    private Engine engine;
    private List<String> equipment = new ArrayList<String>();

    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();

        List<String> newEquipment = new ArrayList<String>(getEquipment());

        Engine newEngine = new Engine();
        newEngine.setCapacity(getEngine().getCapacity());
        newEngine.setFuelType(getEngine().getFuelType());

        newCar.setEquipment(newEquipment);
        newCar.setEngine(newEngine);
        return newCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", make=" + make + ", engine=" + engine
                + ", equipment=" + equipment + "]";
    }


}
