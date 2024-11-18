package oops.inheritence;

public class Dog extends Animal {

    String sound;

    public Dog(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void displayName() {
        super.displayName();
        System.out.println(name+" Sounds like "+sound);
    }
}
