package codewars;

import java.util.Arrays;

public class LowestHighest {

    public static void main(String[] args) {
        System.out.println(highAndLow("2 5 -1"));
    }

    public static String highAndLow(String numbers) {
        String result = "";
        String [] arr = numbers.split(" ");
        int [] intArr = new int [arr.length];
        for(int i =0; i<arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);

        result += Integer.toString(intArr[intArr.length-1]) + " ";
        result += Integer.toString(intArr[0]);
        return result;
    }

    public static String highAndLow2(String numbers) {
        int[] num = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        return num[num.length-1]+ " " + num[0];
    }
}
