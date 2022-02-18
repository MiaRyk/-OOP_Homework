package HW9.Professions;

public class Person {
    private String nameFS;
    private int experience;

    public Person(String nameFS, int experience) {
        this.nameFS = nameFS;
        this.experience = experience;
    }

    public String getNameFS() {
        return nameFS;
    }

    public void setNameFS(String nameFS) {
        this.nameFS = nameFS;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "Name: " + getNameFS() + ", Experience: " + getExperience();
    }
}
