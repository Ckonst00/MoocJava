package main.java;

public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int bookPages, int publicationYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = publicationYear;
    }


    public String getTitle() {
        return this.title;
    }
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages" + ", " + this.year;
    }
}
