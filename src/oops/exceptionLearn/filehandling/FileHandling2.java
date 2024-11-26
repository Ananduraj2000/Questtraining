package oops.exceptionLearn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("FileWritter1.txt");
            fw.write("Hello World, file writer example");//write content
            fw.append('a');//adding 1 character

            //fw.append("@chara",2,10);

            CharSequence charSequence = new CharSequence() {
                @Override
                public int length() {
                    return 0;
                }

                @Override
                public char charAt(int index) {
                    return 0;
                }

                @Override
                public CharSequence subSequence(int start, int end) {
                    return null;
                }

                @Override
                public String toString() {
                    return "File write using char sequence ";
                }
            };
            fw.append(charSequence);
            fw.close();//closing
            System.out.println("File successfully written");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
