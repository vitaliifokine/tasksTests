package leetCode;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int [] i = {7, 8, 9};
        System.out.println(Arrays.toString(twoSum(i, 17)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int [] indexes = new int [2];
        HashMap<Integer, Integer> map = new HashMap();

        for (int i=0; i< nums.length; i++){
            Integer complement = target - nums[i];
            if(map.containsKey(complement)){
                indexes [1] = map.get(complement);
                indexes [0] = i;
            }
            else {
                map.put(nums[i], i);
            }

        }

        return indexes;
    }
}
