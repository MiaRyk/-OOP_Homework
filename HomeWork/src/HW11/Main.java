package HW11;

import HW11.Login.UsernamePassword;
import HW11.Tasks.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchElementException, LowercaseException {
        Scanner scanner = new Scanner(System.in);
        try {
            Start();
        } catch (NoSuchElementException exception) {
            System.err.println("Only numbers can be entered.Try again:");
        } finally {
            Start();
        }
            System.out.println("Choose number (1-5) to get program");
            int programN = scanner.nextInt();
            switch (programN) {
                case 1:
                    EvenNumber evenN = new EvenNumber();
                    evenN.getEvenNumber();
                    break;
                case 2:
                    Reverse doRev = new Reverse();
                    doRev.getReversedStr();
                    break;
                case 3:
                    Fibonacci doF = new Fibonacci();
                    doF.getFibonacci();
                    break;
                case 4:
                    Replace doR = new Replace();
                    doR.replaceChar();
                    break;
                case 5:
                    System.out.println("Sorry, it's not done yet:(");
                    break;
                default:
                    System.out.println("Error. Invalid input.");
                    System.exit(0);
            }
        }
    public static void Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username and password:");
        String username = scanner.nextLine();
        int pass = scanner.nextInt();
        UsernamePassword print = new UsernamePassword(username, pass);
        print.check();}
}