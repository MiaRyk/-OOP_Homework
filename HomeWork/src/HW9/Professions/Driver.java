package HW9.Professions;

import HW9.Professions.Person;

public class Driver extends Person {
    private int age;
    private String gender;

    public Driver(String nameFS, int experience, int age, String gender) {
        super(nameFS, experience);
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return super.toString() + ", Age: " + age + ", Gender: " + gender;
    }
}
