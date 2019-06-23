package sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]array={6,8,45,1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    //Iterative bubble sort
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


    /// task sort words, idea to use bit value (char)
    // char s = (char)68; 65-90
    // Input String words - Cassandra, Abba, Manage
    // get 0 of each word
    // get numeric value of char
    // sort numeric values
    //return result
}
