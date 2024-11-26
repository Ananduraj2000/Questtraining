package oops.exceptionLearn;

public class LargeBook extends Book {

    int noOfPages;

    public LargeBook(String title, String author, int noOfPages) {
        super(title, author);
        this.noOfPages = noOfPages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("No of pages is: " + noOfPages);
    }

    public void modulePages(int modules){
        try{
            int totalPages = noOfPages/modules;
            System.out.println("Total number of pages is: " + totalPages);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception here !!!!!"+e.getMessage());
        }

    }
}
