package oops.exceptionLearn;

public class CustomException {
    public static void main(String[] args) {
        String s=null;

        try{
            System.out.println("enter the string "+s.length());
        }catch(NullPointerException e){
            System.out.println("Exception caught:"+e);
            e.printStackTrace();
        }
    }
}
