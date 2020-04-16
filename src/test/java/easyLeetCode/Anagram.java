package easyLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        // int [] res = anagramMappings(A, B);
//        for (int i : res){
//            System.out.printf(i + " ");
//        }
        anagramMappings(A, B);
    }

    public static int[] anagramMappings(int[] A, int[] B) {
        int res[] = new int[A.length];
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int b = 0; b < B.length; b++) {
                if (A[i] == B[b]) {
                    res[i] = b;
                }
            }

        }
        return res;
    }

    public static int[] anagramMappingsStream(int[] A, int[] B) {
        int res[] = new int[A.length];
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int b = 0; b < B.length; b++) {
                if (A[i] == B[b]) {
                    res[i] = b;
                }
            }

        }
        return res;
    }
}
