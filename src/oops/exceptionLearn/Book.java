package oops.exceptionLearn;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
