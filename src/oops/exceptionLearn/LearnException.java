package oops.exceptionLearn;

public class LearnException {
    public static void main(String[] args) {

        int a=10;
        int b=2;//adjust the value to 2,will get result=5;
        int index=6;
        int [] array={1,3,4,5,6};

        try{
            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }

            int x=a/b;
            System.out.println("Result:"+x);

            if(index<0 || index>array.length){
                throw new ArrayIndexOutOfBoundsException( index+" out of bounds");
            }
        }catch(ArithmeticException e){
            System.out.println("Error:"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:"+e);
        }catch(NullPointerException e){
            System.out.println("Error:");
        }finally {
            System.out.println("Completed");
        }
    }


}
