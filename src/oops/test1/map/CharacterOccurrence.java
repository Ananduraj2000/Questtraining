package oops.test1.map;

import java.util.HashMap;

public class CharacterOccurrence {
    public static void main(String[] args) {

        String str="MALAYALAM";

        HashMap<Character, Integer> map=new HashMap<>();

        for(Character c:str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println("Character occurrence"+map);
    }
}
