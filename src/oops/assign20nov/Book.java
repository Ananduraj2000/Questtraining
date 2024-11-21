package oops.assign20nov;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if(!isBorrowed) {
            isBorrowed = true;
        }else{
            System.out.println("Book already borrowed");
        }
    }
    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {

        return "Book[Tittle :"+title+", Author :"+author+", Isbn :"+isbn+"Borrowed :"+isBorrowed+"]";
    }


}
