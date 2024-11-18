package oops.abstraction;

public class StudentFactory {
    public static Student getStudent(String studentName) {
                if(studentName.equalsIgnoreCase("online")){
                    Student onlineStudent=new OnlineStudent();
                    return new OnlineStudent();
                } else if (studentName.equalsIgnoreCase("offline")) {
                    return new OfflineStudent();

                }else{
                        return null;
                }
    }
}
