package oops.exceptionLearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("FILE1.txt");
            System.out.println("File is created successfully");
            int c;
            String str="INPUT STREAM";
            //System.out.println(fis.read());
            FileOutputStream fos = new FileOutputStream("FILE1.txt");
            //fos.write(fis.read());
            fos.write(str.getBytes());
            while((c=fis.read())!=-1){
                System.out.println((char)c);
            }
            //fis.read();

            fis.close();
            fos.close();
            System.out.println("File stream is closed successfully");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
