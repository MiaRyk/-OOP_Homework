package HW9.Professions;

import HW9.Professions.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String nameFS, String gender,int age, int experience) {
        super(nameFS, gender,age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + ", Experience: " + getExperience();
    }
}
