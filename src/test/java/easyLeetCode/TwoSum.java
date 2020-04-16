package easyLeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].


    public static void main(String[] args) {
        int [] given = {5, 5, 3, 5, 5};
        for (int i : twoSum(given, 10)){
            System.out.printf(i +" ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[0] = map.get(temp);
                res[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        for (Integer i : map.keySet()){
            System.out.println(i);
        }
        return res;
    }


}
