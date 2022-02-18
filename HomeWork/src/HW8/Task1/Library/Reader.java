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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    public void takeBook(int number) {
        System.out.println(getName() + " took " + getNumber() + " books");
    }

    public void takeBook(String... books) {
        System.out.println(getName()  + " took books: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Books... books) {
        for (Books book : books) {
            System.out.println(getName()  + " took books: " + book.getBookName() + " by " + book.getAuthor());
        }
    }

    public void returnBook(int number) {
        System.out.println(getName()  + " returned " + getNumber() + " books");
    }

    public void returnBook(String... books) {
        System.out.println(getName()  + " returned books: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Books... books) {
        for (Books book : books) {
            System.out.println(getName()  + " returned books: " + book.getBookName() + " by " + book.getAuthor());
        }
    }

    public String aboutReader() {
        return "Reader " + getName()  + ",number of books: " + getNumber() + ", ph.n.: " + getPhoneN() + ", faculty: " + getFaculty() + ", date of birth: " + getDateOfBirth();
    }
}
