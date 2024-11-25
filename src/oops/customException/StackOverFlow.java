package oops.customException;

public class StackOverFlow {

    public static void causeStackOverflow(){

        causeStackOverflow();

    }

    public static void causeOutOfMemory(){
        try{
            int[] largeArray = new int[Integer.MAX_VALUE];
        }catch(OutOfMemoryError e){
            System.out.println("Not enough memory...."+e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try{
            causeStackOverflow();
        }catch (StackOverflowError e){
            System.out.println("Stack Overflow"+e);
            e.printStackTrace();
        }
        causeOutOfMemory();
    }
}
