package HW11.Tasks;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EvenNumber {
    public void getEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number and find out if it is even or not:");
        try {
            int number = scanner.nextInt();
            System.out.println(number);
            if (number % 2 == 0) {
                System.out.println("Even number");
            } else if (number % 2 != 0) {
                System.out.println("Not even number");
            }
        } catch (NoSuchElementException e) {
            System.err.println("You can not use any characters except numbers");
        } finally {
            getEvenNumber();
        }
    }
}
