package codewars;

import java.util.Arrays;

public class TurtleDistances {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(80, 91, 1)));
    }


    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return null;
        }
        int[] arr = new int[3];

        double distance = v2 - v1;
        double valueInHours = g / distance;
        double valueInMinutes = g / distance * 60 % 60;
        double valueInSeconds = g / distance * 60 * 60 % 60;

        arr[0] = (int) valueInHours;
        arr[1] = (int) valueInMinutes;
        arr[2] = (int) valueInSeconds;
        return arr;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for(Character i : str.toLowerCase().toCharArray()){
            if(i == 'a' || i == 'e' || i == 'o' || i == 'u'){
                vowelsCount += 1;
            }
        }
        return vowelsCount;
    }


}
