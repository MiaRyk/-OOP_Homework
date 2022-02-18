package HW9.Vehicles;

import HW9.Details.Engine;
import HW9.Professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return super.toString() + ", Max speed: " + getMaxSpeed();
    }
}
