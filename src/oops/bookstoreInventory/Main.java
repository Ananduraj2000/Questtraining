package oops.bookstoreInventory;

public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[5];

        books[0]=new Book("ABC","Ron",515.25,6);
        books[1]=new Book("XYZ","DON",315.25,4);
        books[2]=new SpecialEditionBook("WSR","kyla",545.45,4,"Comic");
        books[3]=new Book("PQB","Mary",615.65,2);
        books[4]=new SpecialEditionBook("MRY","Damu",115.25,3,"Horror");

        System.out.println("Book details");
        for(Book book:books){
            System.out.println(book);
        }

        System.out.println("\nPurchasing book 1");
        books[0].purchaseStock(7);
        System.out.println("\nPurchasing book 2");
        books[2].purchaseStock(30);

        double avgPrice=315.25;

        System.out.println("\nPrice above price "+avgPrice + " ::::");
        for(Book book:books){
            if(book.getPrice()>avgPrice){
                System.out.println("> Tittle Name :"+book.getTitle());
            }
        }

    }
}
