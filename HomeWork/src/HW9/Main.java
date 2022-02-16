package HW9;

import HW9.Details.Engine;
import HW9.Professions.Driver;
import HW9.Vehicles.Car;
import HW9.Vehicles.Lory;
import HW9.Vehicles.SportCar;

public class Main {
    Driver carDriver = new Driver("Sam Smith", 5);
    Engine carEngine = new Engine("90", "Tesla");
    Car car = new Car("Tesla", "C", 2263, carDriver, carEngine);

    Driver loryDriver = new Driver("Courtney Love", 20);
    Engine loryEngine = new Engine("100", "Nisan");
    Lory lory = new Lory("Nisan", "D", 6000, loryDriver, loryEngine,300);

    Driver sportCarDriver = new Driver("Kim Russo", 2);
    Engine sportCarEngine = new Engine("70", "Toyota");
    SportCar sportCar = new SportCar("Toyota", "C", 2500, sportCarDriver, sportCarEngine);
}
