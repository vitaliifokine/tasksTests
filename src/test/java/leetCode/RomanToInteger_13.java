package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("XIX"));
        int [] arr = {2, 1, 2};
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(greet("english"));
        System.out.println(9 * 9);
    }

    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public static int romanToInt(String s) {
        String lastSymbol = s.substring(s.length() - 1);
        int lastValue = values.get(lastSymbol);
        System.out.println("Val" + lastValue);

        int total = lastValue;

        for(int i = s.length() - 2; i >= 0; i--) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            if (currentValue < lastValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            lastValue = currentValue;
        }
        return total;
    }


    public static int grow(int[] x){
        int sum = 1;
        for(int i=0; i<x.length; i++){
            sum *= x[i];
            System.out.println(sum);
        }

        return sum;
    }


    public static        boolean betterThanAverage(int[] classPoints, int yourPoints) {
            int total = 0;

        for (int i=0; i<classPoints.length; i++){
            total += classPoints[i];
        }

        System.out.println(total);

        total = total + yourPoints;

        total = total / (classPoints.length + 1);


        return total < yourPoints ? true: false;
    }

    public static String reverseWords(String str){
        String [] arr = str.split(" ");
        String ret = "";
        for (int i =0; i<arr.length; i++){
            ret += arr[arr.length-1-i] + " ";
        }

        return ret.trim();
    }

    public static int expressionsMatter(int a, int b, int c){
        int [] arr = new int [6];
        arr[0] =  a * (b + c);
        arr[1] = a * b * c;
        arr[2] = a + b * c;
        arr[3] = (a + b) * c;
        arr[4] = a + b + c;
        arr[5] = (a * b) + c;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];

    }

    public static String greet(String language) {
        HashMap<String, String> map = new HashMap();
        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");
        if (!map.containsKey(language)){
            return "Welcome";
        }
        return map.get(language);
    }


}
