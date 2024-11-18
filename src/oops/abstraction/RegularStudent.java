package oops.abstraction;

public class RegularStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Attending online and offline classes");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Regural student are submitting assignment");
    }
}
