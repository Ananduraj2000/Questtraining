package oops.assign20nov;

public class Member implements LibraryOperations{



    private String name;
    private int id;
    private String memberType;
    private final int MAX_BORROW_BOOK=5;
    protected int borrowedBooks;

    public Member(String name, int id, String memberType) {
        this.name = name;
        this.id = id;
        this.memberType = memberType;
        this.borrowedBooks = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }



    @Override
    public void borrowBooks(Book book) {
        if(borrowedBooks<MAX_BORROW_BOOK || !book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks++;
            System.out.println(name+" borrowed book"+book);
        }else{
            System.out.println("Cannot borrow anymore!!!!!!");
        }

    }

    @Override
    public void returnBooks(Book book) {
        if(book.isBorrowed()) {
            book.returnBook();
            borrowedBooks--;
            System.out.println(name+" returned book"+book);
        }else{
            System.out.println("Not returned");
        }
    }
    public void printMemberDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", id=" + id + ", memberType=" + memberType + "]";
    }
}
