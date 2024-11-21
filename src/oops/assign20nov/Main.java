package oops.assign20nov;

public class Main {

    public static void main(String[] args) {
        Book b1=new Book("B01","ARM","Tovino");
        Book b2=new Book("B02","LOKI","Marvels");
        Book b3=new Book("B03","Batman","Peter craig");


        System.out.println("\nBOOK DETAILS");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        Member member1=new Member("Tom",101,"Normal");
        Member member2=new Member("Rose",102,"Normal");
        Member pmember=new PremiumMember("Peter",105);

        System.out.println("-----------------------");

        System.out.println("\nMEMBER DETAILS");
        member1.printMemberDetails();
        member2.printMemberDetails();
        System.out.println();

        System.out.println("Premium Member Details");
        pmember.printMemberDetails();


        System.out.println("\nBorrowing Books");
        member1.borrowBooks(b1);
        member2.borrowBooks(b2);

        System.out.println("\nReturning  Books");
        member1.returnBooks(b1);

    }
}
