package adrspo.design.patterns.creational.prototype;

public class Engine {

    private String fuelType;
    private double capacity;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine [fuelType=" + fuelType + ", capacity=" + capacity + "]";
    }


}
