package HW9.Details;

import HW9.CarEngine;

public class Engine implements CarEngine {
    private String power;
    private String mark;

    public Engine(String power, String mark) {
        this.power = power;
        this.mark = mark;
    }

    public void startEngine() {
        System.out.println("The engine is running");
    }

    public void switchOffEngine() {
        System.out.println("The engine was turned off");
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }

    public String toString() {
        return "Power: " + power + " Mark: " + mark;
    }
}
