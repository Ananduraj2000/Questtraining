package oops.test2;

public class Car implements Vehicle {
    @Override
    public void wheel() {
        System.out.println("Car has 4 wheels");
    }

    @Override
    public void engine() {
        System.out.println("It has a petrol engine");
    }
}
