package easyLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(getValues()));
    }

    public static List<Integer> getValues() {
        List<Integer> list = new ArrayList<>();

        int n = 200, t1 = 0, t2 = 1;
       // System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            list.add(t1);
            //System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        return list;
    }
}
