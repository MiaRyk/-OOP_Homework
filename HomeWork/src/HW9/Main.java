package HW9;

import HW9.Details.Engine;
import HW9.Professions.Driver;
import HW9.Vehicles.Car;
import HW9.Vehicles.Lorry;
import HW9.Vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Driver carDriver = new Driver("Sam Smith", 5, 28, "M");
        Engine carEngine = new Engine("90", "Tesla");
        Car car = new Car("Tesla", "C", 2263, carDriver, carEngine);

        Driver lorryDriver = new Driver("Courtney Love", 20, 50, "F");
        Engine lorryEngine = new Engine("100", "Nisan");
        Lorry lorry = new Lorry("Nisan", "D", 6000, lorryDriver, lorryEngine, 4.5);

        Driver sportCarDriver = new Driver("Mark Russo", 2, 20, "M");
        Engine sportCarEngine = new Engine("70", "Toyota");
        SportCar sportCar = new SportCar("Toyota", "C", 2500, sportCarDriver, sportCarEngine, 250);

        System.out.println("Car:");
        System.out.println(car);
        System.out.println("Lorry:");
        System.out.println(lorry);
        System.out.println("Sports car");
        System.out.println(sportCar);

        System.out.println("You can try driving!");
        carEngine.startEngine();
        car.drive();
        car.turnLeft();
        car.turnRight();
        car.stop();
        carEngine.switchOffEngine();
    }
}
