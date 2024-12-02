package oops.test1.map;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        String input="Java is fun and java is powerful";

        String [] str=input.toLowerCase().split(" ");

        Map<String,Integer> wf=new HashMap<>();

        for(String word:str){
            if(wf.containsKey(word)){
                wf.put(word, wf.get(word) + 1);
            }else{
                wf.put(word, 1);
            }


        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wf.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
