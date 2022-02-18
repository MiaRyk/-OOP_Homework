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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return super.toString() + ", Age: " + getAge() + ", Gender: " + getGender();
    }
}
