package oops.test2;

public class Common {
    public static void main(String[] args) {
        int [] array={10,20,10,10,30,20,50,40,40,30,30,10};
        int [] sameNumber={10,20,30,40};

        for(int num:sameNumber){
            int count=0;

            for(int value:array ){
                if(value==num){
                    count++;
                }
            }

            int pairs=count/2;

            if(count>0){
                System.out.println(num+"--"+pairs+" pairs ");
            }
        }
    }
}
