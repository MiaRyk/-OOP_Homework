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

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBooks() {
        return getBookName() + " by " + getAuthor();
    }

}