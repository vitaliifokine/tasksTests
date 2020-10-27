package easyLeetCode;

public class FizzBuzz {


    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));

    }

    public static Object fizzBuzz (Integer integ){
        if (integ % 3  == 0 && integ % 5 == 0){
            return "fizzBuzz";
        }

        if(integ % 3 == 0 && integ % 5 !=0){
            return "fizz";
        }

        if(integ % 5 == 0 && integ % 3 !=0){
           return "buzz";
        }
        return integ;
    }
}
