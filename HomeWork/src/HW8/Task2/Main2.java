package HW8.Task2;

import HW8.Task2.University.Aspirant;
import HW8.Task2.University.Student;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student("Rose", "McCartney", 9212, 5);
        Aspirant aspirant = new Aspirant("Holly", "Berry", 9103, 4.3, "'Ocean pollution'");
        Student aspirant1 = new Aspirant("Jasmine", "Aladdin", 2222, 5, "'Cartilaginous fishes'");
        System.out.println("Information about students and aspirants:");
        System.out.println(student.getInfo());
        System.out.println(aspirant.getInfo());
        System.out.println(aspirant1.getInfo());

    }
}
