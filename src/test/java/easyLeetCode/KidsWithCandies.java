package easyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {
        int [] d = {12, 1, 2};
        kidsWithCandies(d, 3);
        System.out.println(kidsWithCandies(d, 10));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List num = new ArrayList();
        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= 5) {
                num.add(i, true);
            }
            else {
                num.add(i, false);
            }
        }
        return  num;
    }


}
