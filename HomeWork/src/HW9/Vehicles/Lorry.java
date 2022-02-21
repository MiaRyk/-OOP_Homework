package HW9.Vehicles;

import HW9.Details.Engine;
import HW9.Professions.Driver;

public class Lorry extends Car {
    private double carryingCapacity;

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, double carryingCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public String toString() {
        return super.toString() + ", Carrying capacity: " + getCarryingCapacity();
    }
}
