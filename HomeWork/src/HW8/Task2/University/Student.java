package HW8.Task2.University;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        if (averageMark == 5)
            return 100;
        else return 80;
    }

    public String getInfo() {
        return "First name: " + firstName + ", Last name: " + lastName + ", Group: " + group + ", Average mark: " + averageMark + ", Scholarship: " + getScholarship();
    }
}
