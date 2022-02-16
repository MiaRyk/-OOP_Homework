package HW8.Task1.Library;

public class Books {
    private String bookName;
    private String author;

    public Books(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getBooks() {
        return bookName + " by " + author;
    }

}