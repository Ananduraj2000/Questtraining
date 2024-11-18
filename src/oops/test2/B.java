package oops.test2;

public class B {
    void add(int a,int b){
        int sum=a+b;
        System.out.println("B class add:"+sum);
    }
    void add(){
        System.out.println("B class add no arguments");
    }
    static void add(int a){
        System.out.println("B class inside static add"+a);
    }
}
