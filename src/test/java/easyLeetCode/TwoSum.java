package easyLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].


    public static void main(String[] args) {
        int [] given = {9, 5, 1, 1, 4, 5, 1};
        System.out.println(Arrays.toString(twoSum2(given, 2)));



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

    public static int[] twoSum2(int[] nums, int target) {
        for (int counter = 0; counter < nums.length; counter++) {
            for (int j = counter+1; j < nums.length; j++) {
                if (nums[j] == target - nums[counter]) {
                    // если число == цель - число, то выводим индексы
                    return new int[] { counter, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
