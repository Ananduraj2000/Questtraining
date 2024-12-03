package oops.secondAssessment.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByFrequency {

    public static Map<Integer,List<Integer>> groupBy(List<Integer> input){

        if(input==null){
            throw new IllegalArgumentException("input list cannot be empty");
        }


        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(Integer i:input){

            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);

        }


        Map<Integer, List<Integer>> group = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry:frequencyMap.entrySet()){
            int number = entry.getKey();
            int frequency= entry.getValue();

            if(!group.containsKey(frequency)){
                group.put(frequency,new ArrayList<>());
            }
            group.get(frequency).add(number);
        }
        return group;



    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        Map<Integer,List<Integer>> out = groupBy(list);
        System.out.println(out);



    }

}
