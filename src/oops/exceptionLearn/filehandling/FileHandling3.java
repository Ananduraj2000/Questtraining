package oops.exceptionLearn.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {
    public static void main(String[] args) {
        File file2 = new File("FILE4.txt");

        try {
            if (file2.createNewFile()) {
                System.out.println("File created" + file2.getPath());
            } else {
                System.out.println("File already existed or not created");
            }
            if (file2.exists()) {
                Scanner sc = new Scanner(file2);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(file2.delete()){
                System.out.println("File deleted");
            }else {
                System.out.println("File not deleted");
            }
        }
    }
}
