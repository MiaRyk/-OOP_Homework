package HW9.Vehicles;

import HW9.Details.Engine;
import HW9.Professions.Driver;

public class SportCar extends Car{
    private double maxSpeed;
    public SportCar (String brand, String carClass, double weight, Driver driver, Engine engine){
        super(brand, carClass,weight,driver,engine);
        this.maxSpeed = maxSpeed;
    }
    public String toString(){
    return super.toString()+", max speed: "+maxSpeed;
    }
}
