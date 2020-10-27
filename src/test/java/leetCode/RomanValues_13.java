package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanValues_13 {


    public static void main(String[] args) {
        System.out.println(getNumberFromRoman("XXIV"));
    }

    public static int getNumberFromRoman(String number) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);

        int result = 0;

        while (number.length() !=0) {
                int currentValue = values.get(number.charAt(number.length() - 1));
                if (number.length() == 1 || values.get(number.charAt(number.length() - 2)) >= currentValue) {
                    result += currentValue;
                    number = number.substring(0, number.length() - 1);
                } else {
                    result += currentValue - values.get(number.charAt(number.length() - 2));
                    number = number.substring(0, number.length() - 2);
                }
            }
        return result;

    }


}
