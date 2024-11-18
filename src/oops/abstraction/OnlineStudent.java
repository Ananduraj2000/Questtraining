package oops.abstraction;

public class OnlineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Online student Attending class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Online student Submit assignment");
    }
}
