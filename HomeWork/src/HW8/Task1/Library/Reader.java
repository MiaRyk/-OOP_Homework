package HW8.Task1.Library;

import HW8.Task1.Main;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String dateOfBirth;
    private String phoneN;

    public Reader(String name, int number, String faculty, String dateOfBirth, String phoneN) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneN = phoneN;
    }

    public void takeBook(int number) {
        System.out.println(name + " took " + number + " books");
    }

    public void takeBook(String... books) {
        System.out.println(name + " took books: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Books... books) {
        for (Books book : books) {
            System.out.println(this.name + " took books: " + book.getBookName() + " by " + book.getAuthor());
        }
    }

    public void returnBook(int number) {
        System.out.println(name + " returned " + number + " books");
    }

    public void returnBook(String... books) {
        System.out.println(name + " returned books: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Books... books) {
        for (Books book : books) {
            System.out.println(name + " returned books: " + book.getBookName() + " by " + book.getAuthor());
        }
    }

    public String aboutReader() {
        return "Reader " + name + ",number of books: " + number + ", ph.n.: " + phoneN + ", faculty: " + faculty + ", Date of birth: " + dateOfBirth;
    }
}
