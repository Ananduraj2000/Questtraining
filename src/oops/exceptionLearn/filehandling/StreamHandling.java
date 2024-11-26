package oops.exceptionLearn.filehandling;

import java.io.*;

public class StreamHandling {
    public static void main(String[] args) {
        File f=new File("fileStream.txt");

        try{

           if(f.createNewFile()){
               System.out.println("File created");
           }else{
               System.out.println("File already exists");
           }
            FileInputStream fis = new FileInputStream("fileStream.txt");
            System.out.println("Created successfully");
//            int c;
            String s="do"+"\nyou"+"\nwant"+"\na"+"\nchaya";
            FileOutputStream fos = new FileOutputStream("fileStream.txt",true);
            fos.write(s.getBytes());
//            while((c=fis.read())!=-1){
//                System.out.println((char)c);
//            }
            fos.close();
            fis.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
