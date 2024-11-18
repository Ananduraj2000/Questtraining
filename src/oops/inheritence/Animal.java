package oops.inheritence;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Animal Name : " + name);
    }
}
