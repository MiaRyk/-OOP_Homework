package HW8.Task1;

import HW8.Task1.Library.Books;
import HW8.Task1.Library.Reader;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("K.Stewart", 1, "Art", "12.07.1995", "+0002020220");
        Reader reader2 = new Reader("P.Dinklage", 2, "Gryffindor", "20.02.1985", "+123456789");
        Reader reader3 = new Reader("P.Parker", 3, "PE", "11.11.2000", "+380678975432");
        Reader reader4 = new Reader("N.Kidman", 4, "Linguistics", "09.11.1978", "+806733333");
        Reader[] readers = {reader1, reader2, reader3, reader4};

        Books book1 = new Books("Twilight", "Stephenie Meyer");
        Books book2 = new Books("A Storm Of Swords", " George Martin");
        Books book3 = new Books("Crazy Rich Asians", "Kevin Kwan");
        Books book4 = new Books("It", "Stephen King");
        Books[] books = {book1, book2, book3, book4};

        libraryInformation(readers, books);

        System.out.println("Report:");
        reader1.takeBook(1);
        reader2.takeBook("It");
        reader3.takeBook(book2, book1);
        reader3.takeBook(book4);

        reader1.returnBook(1);
        reader2.returnBook("Crazy Rich Asians");
        reader3.returnBook(book3);

    }

    private static void libraryInformation(Reader[] readers, Books[] books) {
        System.out.println("List of readers:");
        for (Reader reader : readers) {
            System.out.println(reader.aboutReader());
        }
        System.out.println("List of books:");
        for (Books book : books) {
            System.out.println(book.getBooks());
        }
    }
}
