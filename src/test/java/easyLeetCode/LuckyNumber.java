package easyLeetCode;

import java.util.HashMap;
import java.util.Map;

public class LuckyNumber {

    public static void main(String[] args) {
        int [] numbers = {2, 2, 4, 5};
        System.out.println(findLucky(numbers));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int bigger =0;
        for(Map.Entry<Integer, Integer> c: map.entrySet()){
            if(c.getKey().equals(c.getValue())){
                if(bigger < c.getKey()) {
                    bigger = c.getKey();
                }
            }
        }
        System.out.println(bigger);
        return bigger == 0 ? -1 : bigger;
    }
}
