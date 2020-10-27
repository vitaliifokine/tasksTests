package easyLeetCode;

import java.util.Arrays;

public class Summation {

    public static void main(String[] args) {
        System.out.println(solution("World"));
        System.out.println(Arrays.toString(digitize(123456)));
        int [] id = {-17, 9, 5};
        System.out.println(-17 * -1);
        System.out.println(sum(id));
        System.out.println(Arrays.toString(invert2(id)));
    }

    public static int summation(int n) {
        int value = 0;
        for (int i=1; i<= n; i++){
            value += i;
        }
        return value;
    }

    public static String solution(String str) {
        String newString = "";
        for (int i = str.length(); i <= str.length() && i > 0; i--){
            newString += str.charAt(i-1);
        }
        return newString;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++){
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i] == true) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static Integer basicMath(String op, int v1, int v2){
        Integer value = 0;
        switch(op){
            case "+":
                value = v1 + v2;
                break;
            case "-":
               value = v1 - v2;
                break;

            case "*":
                value = v1 * v2;
                break;

            case "/":
                value = v1 / v2;

        }
        return value;
    }

    public static int squareSum(int[] n){
        int value = 0;
        for(int i=0; i<n.length; i++){
            value += n[i]*n[i];
        }
        return value;
    }

    public static int[] digitize(long n) {
        String s=Long.toString(n);
        int arr [] = new int [s.length()];
        for (int i = 0; i<=s.length()/2; i++){
            Character end = s.charAt(s.length()-1-i);
            Character start = s.charAt(i);
            int temp = Integer.parseInt(start.toString());
            arr[i] = Integer.parseInt(end.toString());
            arr[s.length()-1-i] = temp;
        }
        return arr;
    }

    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String [] arr = name.split(" ");
        String s = arr[0].charAt(0) + "." + arr[1].charAt(0);
        return s;
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null){ int [] arr= {}; return arr; }
        if (input.length == 0){ int [] arr= {}; return arr; }
        int [] arr = new int[2];
        int positives = 0;
        int negative = 0;
        for(int i=0; i<input.length; i++){
            if(input[i] > 0 && input[i] != 0){
                positives += 1;
            }
            if (input[i] < 0 && input[i] != 0){
                negative += input[i];
            }
        }
        if (positives != 0 && negative != 0) {
            arr[0] = positives;
            arr[1] = negative;
        }
        return arr;
    }

    public static int sum(int[] numbers) {
        if (numbers == null){ int [] arr= {}; return 0; }
        if (numbers.length == 0 || numbers.length == 1){ int [] arr= {}; return 0; }
        Arrays.sort(numbers);
        int sum = 0;
        for(int i=0; i <numbers.length; i++){
            if(!(i== 0 || i== numbers.length-1)){
                System.out.println("num " + i);
                sum += numbers[i];
            }
        }
        return sum;
    }


    public static int[] invert(int[] array) {
        int [] arr = new int [array.length];
        if (array == null){ return arr; }
        if (array.length == 0){ return arr; }
        for(int i=0; i<array.length; i++){
            if(array[i] < 0){
                arr[i] = array[i] -(array[i] * 2);
            }
            if(array[i] > 0){
                arr[i] = array[i] - array[i] * 2;
                System.out.println("Inside" + array[i]);
            }

        }
        return arr;
    }

    public static int[] invert2(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }


}
