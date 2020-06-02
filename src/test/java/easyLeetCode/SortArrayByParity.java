package easyLeetCode;

public class SortArrayByParity {

    public static void main(String[] args) {
        int [] input = {3,1,2,4};
        sortArrayByParity(input);
        for (int i : sortArrayByParity(input)){
            System.out.println(i);
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int [] temp = new int[A.length];
        int count = 0;
        for (int i=0; i<A.length; ++i){
            if (A[i]%2==0){
                temp[count++]=A[i];
            }
        }

        for (int i=0; i<A.length; ++i){
            if (A[i]%2!=0){
                temp[count++]=A[i];
            }
        }

        return temp;
    }
}
