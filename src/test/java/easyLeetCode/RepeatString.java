package easyLeetCode;

import java.util.Arrays;

public class RepeatString {

    public static void main(String[] args) {
        System.out.println(repeatStr(2, "Hello"));
        System.out.println(noSpace("d ff"));
        int [] arr = {5, 9, -99};
        System.out.println(findSmallestInt2(arr));
    }

    public static String repeatStr(final int repeat, final String string) {
        String value = "";
        for(int i=0; i< repeat; i++){
            value += string;
        }
        return value;
    }

    static String noSpace(final String x) {
        String resultValue = "";
        for(int i=0; i<x.length(); i++) {
            if(x.charAt(i) != ' '){
                resultValue += x.charAt(i);
            }
        }
        return resultValue;
    }

    public static int findSmallestInt(int[] args) {
        int smallest = 0;
        for (int i=0; i< args.length; i++){
            if(i == 0) {
                smallest = args[i];
            }
            else {
                if(smallest > args[i]){
                    smallest = args[i];
                }
            }

        }
        return smallest;
    }

    public static int findSmallestInt2(int[] args) {
        Arrays.sort(args);
        return args[args.length-1];
    }
}
