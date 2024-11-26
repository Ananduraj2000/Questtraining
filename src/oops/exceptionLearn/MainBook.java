package oops.exceptionLearn;

import static java.lang.Class.forName;

public class MainBook {
    public static void main(String[] args) {

        String[] book = {"ABC", "XYZ", "KLM"};

        try {
            System.out.println("Book at index 5" + book[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception here " + e);
            e.printStackTrace();
        }

        try{
            Class.forName("oops.exceptionLearn.MainBooks");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception here for class " + e);
            e.printStackTrace();
        }

        System.out.println("\nDetails of Sample Book");
        Book book1 = new Book("ABC", "KLM");
        book1.display();

        System.out.println("\nDetails of Large book");
        LargeBook lb = new LargeBook("FFF", "X", 200);

        System.out.println();
        lb.display();

        System.out.println();
        lb.modulePages(0);
    }
}
