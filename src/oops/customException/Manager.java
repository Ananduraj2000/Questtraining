package oops.customException;

public class Manager extends Employee{

   private int teamSize;

    public Manager(String name, int age, double salary,int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if(teamSize < 1){
            throw new IllegalArgumentException("Team size must be greater than 0");
        }
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manger [teamSize=" + teamSize + "]";
    }
}
