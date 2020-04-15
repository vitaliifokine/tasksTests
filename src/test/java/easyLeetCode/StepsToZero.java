package easyLeetCode;

public class StepsToZero {
//
//    Input: num = 14
//    Output: 6
//    Explanation:
//    Step 1) 14 is even; divide by 2 and obtain 7.
//    Step 2) 7 is odd; subtract 1 and obtain 6.
//    Step 3) 6 is even; divide by 2 and obtain 3.
//    Step 4) 3 is odd; subtract 1 and obtain 2.
//    Step 5) 2 is even; divide by 2 and obtain 1.
//    Step 6) 1 is odd; subtract 1 and obtain 0.

    public static void main(String[] args) {
        int input = 14;
        System.out.println(numberOfSteps(input));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while(num!=0){
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count +=1;

        };

        return count;
    }
}
