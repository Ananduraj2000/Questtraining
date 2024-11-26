package oops.exceptionLearn;

public class TryCatchTest {
    public static void main(String[] args) {

        int i=10;
        int div=0;

        try{
            int x=i/div;
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("There is some exception in the code flow");
        }finally {
            System.out.println("inside finally");
        }
        System.out.println("here");
    }
}
