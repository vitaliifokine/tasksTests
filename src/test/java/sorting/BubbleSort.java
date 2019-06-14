package sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]array={6,8,45,1};
        String[] fruitArray = {"Apple", "Banana", "Orange", "Grapes"};
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(Arrays.toString(bubbleSort2(fruitArray)));
    }

    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    static String[] bubbleSort2(String[] arr) {
        String [] characters = new String[arr.length-1];
        for (int i=0; i<arr.length-1;i++){
//           String param = arr[i].charAt(i);
//            characters[i] = param;
        }

        return characters;
    }


    /// task sort words, idea to use bit value (char)
    // char s = (char)68; 65-90
    // Input String words - Cassandra, Abba, Manage
    // get 0 of each word
    // get numeric value of char
    // sort numeric values
    //return result
}
