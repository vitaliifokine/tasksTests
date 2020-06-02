package easyLeetCode;

import java.util.ArrayList;

public class TargetArray {

    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        int [] res = (createTargetArray(nums, index));
        for (int i:res){
            System.out.println(i);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
            result.add(index[i], nums[i]);
        }
        int[] arr = result.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

}
