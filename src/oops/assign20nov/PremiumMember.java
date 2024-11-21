package oops.assign20nov;


public class PremiumMember extends Member {
    private final int MAX_BORROW_BOOK=5;
    public PremiumMember(String name,int id) {
        super(name,id,"Premium");
    }

    @Override
    public void borrowBooks(Book book){
        if(borrowedBooks<MAX_BORROW_BOOK || !book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks++;
            System.out.println(getName()+" borrowed book"+book);
        }else{
            System.out.println("Cannot borrow anymore!!!!!!");
        }
    }

    @Override
    public void returnBooks(Book book){

    }

}
