package oops.secondAssessment.second;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {
public static List<List<Integer>> partition(List<Integer> list, int n) {
    //empty list
    List<List<Integer>> list1 = new ArrayList<>();

    //
    for (int i = 0; i < list.size(); i+=n) {

        int end = Math.min(i + n, list.size());//finding end element
        list1.add(new ArrayList<>(list.subList(i, end)));//adding sublist to list 1
    }
    return list1;
}

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int partitionSize=2;
        List<List<Integer>> partitionList = partition(list, partitionSize);
        System.out.println(partitionList);
    }
}
