package easyLeetCode;

public class Sample {

    public static void main(String[] args) {
        System.out.println(doIt("100"));

    }

    public static int doIt(String text){
        if (text.equalsIgnoreCase("100")){
            return 10;
        }
        System.out.println("Volodya");
        throw new IllegalArgumentException();
    }

}
