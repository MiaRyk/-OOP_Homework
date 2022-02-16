package HW9.Vehicles;

import HW9.Details.Engine;
import HW9.Professions.Driver;

public class Lory extends Car {
    private double carryingCapacity;
    public Lory(String brand, String carClass, double weight, Driver driver, Engine engine){
        super(brand, carClass,weight,driver,engine);
        this.carryingCapacity = carryingCapacity;
    }
    public String toString() {
        return super.toString()+", lory carrying capacity: " + carryingCapacity;
    }
}
