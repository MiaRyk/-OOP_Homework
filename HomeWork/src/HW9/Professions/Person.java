package HW9.Professions;

public class Person {
    private String nameFS;
    private int age;
    private String gender;
    public Person(String nameFS, String gender, int age) {
        this.age = age;
        this.gender = gender;
        this.nameFS = nameFS;
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

    public String getNameFS() {
        return nameFS;
    }

    public void setNameFS(String nameFS) {
        this.nameFS = nameFS;
    }

    public String toString() {
        return "Name: " + getNameFS() + ", Gender: "+getGender()+", Age: "+getAge();
    }
}
