package oops.abstraction;

public class OfflineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Offline student attending class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Offline student submit assignment");
    }
}
