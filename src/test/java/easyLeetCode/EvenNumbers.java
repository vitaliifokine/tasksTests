package easyLeetCode;

public class EvenNumbers {

    public static void main(String[] args) {
        int [] input = {12,345,2,6,8967};
        findNumbers(input);
        System.out.println(findNumbers(input));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if((nums[i] > 9  && nums[i]< 100) || (nums[i] >999 && nums[i] < 10_000)
                    || (nums[i] == 100_000 ))
            {
                count++;
            }
        }
        return count;
    }
}
