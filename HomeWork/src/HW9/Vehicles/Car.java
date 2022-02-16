package HW9.Vehicles;

import HW9.Details.Engine;
import HW9.Professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;
    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void drive() {
        System.out.println("Drive");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return "Driver: " + driver + ", Car: " + brand + " (" + carClass + ", " + weight + ", " + engine + ")";
    }
}
