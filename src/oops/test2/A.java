package oops.test2;

public class A extends B {
    A(){
        System.out.println("Constructor of A class");
    }
    void add(){
        this.add();
        System.out.println("A class add method");
    }

    @Override
    void add(int c,int d){
        super.add(c,d);
        int s=c+d;
        System.out.println("A class add method with arguments");
    }

    static void add(int a){
        System.out.println("A inside static add"+a);
    }

    public static void main(String[] args) {
            A a = new A();
            a.add(2,3);

    }
}
