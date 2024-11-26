package oops.bookstoreInventory;

public class Book {
    private String title;
    private String author;
    private double price;
    private int  stock;

    public static final double DISCOUNT_PERCENTAGE= 10.0;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(String title){
        this.title = title;
    }

    public void purchaseStock(int quantity){
        try{
            if(quantity > stock){
                throw new OutOfStockException("Not enough stock");
            }else{
                stock = stock - quantity;
                System.out.println("Purchase successful");
            }
        }catch(OutOfStockException e){
            System.out.println("exception here "+e);
            e.getMessage();

        }
    }

    @Override
    public String toString(){
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

}
