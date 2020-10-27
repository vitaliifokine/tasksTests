package easyLeetCode;

public class ReturnNegative {

    public static void main(String[] args) {
        System.out.println(makeNegative(56));
    }

    public static int makeNegative(final int x) {
        if(x > 0){
            return x - (x * 2);
        }
        else{
            return x;
        }

    }
}
