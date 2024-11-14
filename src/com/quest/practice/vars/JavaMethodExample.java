package com.quest.practice.vars;

public class JavaMethodExample {

    public static void main(String[] args) {

        JavaMethodExample javaMethodExample = new JavaMethodExample();
        javaMethodExample.display("hello");
        int result= javaMethodExample.add(10, 20);
        System.out.println(result);
    }

    /**
     * display string
     * @param str
     */
    private void display(String str){
        System.out.println(str);
    }

    /**
     *
     * @param a=n1
     * @param b=n2
     * @return a+b
     */
    private int add(int a, int b){
        return a+b;
    }
}
