package oops.exceptionLearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file=new File("FILE1.txt");

/*
            try{
            if(file.createNewFile()){
                System.out.println("File exist "+file.getPath());
            }else{
                System.out.println("File not exists");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
*/
        //file.getpath
        //file.getabsolutepath

        try{
            System.out.println("try started");
            if(file.createNewFile()){
                Scanner sc=new Scanner(file);

                while(sc.hasNextLine()){
                    String line=sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
                System.out.println("File Created");
            }else{
                System.out.println("File does not exist");
            }
            System.out.println("try finished");
        }catch (IOException e) {
            e.printStackTrace();
        }
//        }finally {
//            //file.delete();
//            System.out.println("File Deleted");
//        }

    }
}
