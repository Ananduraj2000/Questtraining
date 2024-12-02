package oops.test1.map;

import java.util.HashMap;
import java.util.Map;

public class PriceMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mobile", 17000);
        map.put("Car", 170000);
        map.put("Pen", 20);
        map.put("Chocolate", 100);
        map.put("Book", 250);

        System.out.println("\nProducts : Price");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.put("Book",350);
        System.out.println("\nUpdated price :");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String highProduct=null;
        int highPrice=Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>highPrice) {
                highPrice=entry.getValue();
                highProduct=entry.getKey();
            }
        }
        if(highProduct!=null) {
            System.out.println("\nProduct with highest product is  : " + highProduct+" (price) :"+highPrice);
        }else{
            System.out.println("\nNo product");
        }
    }
}
